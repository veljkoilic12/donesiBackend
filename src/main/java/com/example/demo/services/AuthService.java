package com.example.demo.services;

import java.security.Key;
import java.util.List;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.User;
import com.example.demo.repositories.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class AuthService implements AuthServiceInterface{
	
	@Autowired
	private UserRepository userRepo;
	
	private SignatureAlgorithm alg=SignatureAlgorithm.HS256;

	private String keyString="pjeskovi123pjeskovi456pjeskovi789";
	byte[] keyBytes=DatatypeConverter.parseBase64Binary(keyString);
	Key key=new SecretKeySpec(keyBytes, alg.getJcaName());
	
	@Override
	public String encodeToken(String username, String password) {
		User user=getUser(username, password);
		if(user==null)
			return null;
		long nowMilis=System.currentTimeMillis();
		JwtBuilder builder=Jwts.builder().setId(Integer.toString(user.getId()))
				.claim("username", user.getUname())
				.claim("type", user.getAdmin()?"A":"R")
				.signWith(alg, key);
		return "Bearer "+builder.compact();
	}

	@Override
	public User decodeToken(String token) {
		token=token.replace("Bearer ", "");
		User user=null;
		try {
			Claims claims = Jwts.parser()
		            .setSigningKey(key)
		            .parseClaimsJws(token).getBody();
			user=userRepo.getOne(Integer.parseInt(claims.getId()));
		}catch(Exception e) {
			return null;
		}
		return user;
	}
	
	private User getUser(String username, String password) {
		List<User> users=userRepo.findByUnameAndPasswd(username, password);
		if(users.isEmpty())
			return null;
		else
			return users.get(0);
	}

}
