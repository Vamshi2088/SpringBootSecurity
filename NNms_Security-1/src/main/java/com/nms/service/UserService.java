package com.nms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nms.bo.UsersBo;
import com.nms.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepo;
	
	@Bean
      public Md4PasswordEncoder encoder() {
    	  return new Md4PasswordEncoder();
      }
	
	public UsersBo save(UsersBo userbo) {
		userbo.setPassword(encoder().encode(userbo.getPassword()));
		userrepo.save(userbo);
		return userbo;
	}
	

}
