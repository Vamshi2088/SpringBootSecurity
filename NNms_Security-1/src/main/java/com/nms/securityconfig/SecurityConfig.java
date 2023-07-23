package com.nms.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.nms.service.UserServiceForLogin;

@EnableWebSecurity
@Configuration
public class SecurityConfig  {
	
	@Autowired
	Md4PasswordEncoder encoder;
	MessageDigestPasswordEncoder ms;
	@Autowired
	UserServiceForLogin forLogin;
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		http.csrf(t->t.disable());
		http.authorizeHttpRequests().anyRequest().authenticated().and().formLogin();
		return http.build();
		
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(forLogin).passwordEncoder(encoder);
		
	}

}
