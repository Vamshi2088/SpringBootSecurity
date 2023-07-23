package com.nms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nms.bo.UsersBo;
import com.nms.dao.UserRepository;
@Service
public class UserServiceForLogin  implements UserDetailsService {

	@Autowired
	UserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		UsersBo usersBo = repository.findByUsername(username);
		
		UserDetails build = User.builder()
		.username(usersBo.getUsername())
		.password(usersBo.getPassword())
		.roles(usersBo.getRoles())
	

		.build();
		
		return build;
	}

}
