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
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.nms.service.UserServiceForLogin;

@EnableWebSecurity
@Configuration
public class SecurityConfig  {
	
	@Autowired
	Md4PasswordEncoder encoder;
	@Autowired
	UserServiceForLogin forLogin;
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		http.csrf(t->t.disable());
//		http.authorizeHttpRequests().and()
//		
//		.formLogin(form->form.loginPage("/aa")
//				.defaultSuccessUrl("/welcome").permitAll()
//				).
//		  logout(logout->logout
//						.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//						.permitAll()
//						
//						);
	    http
        .authorizeRequests()
            .antMatchers("/WEB-INF/**", "/resources/**").permitAll() // Allow access to login page and static resources
            .anyRequest().authenticated() // All other requests require authentication
            .and()
        .formLogin()
            .loginPage("/aa") // Specify the custom login JSP page URL
            .loginProcessingUrl("/login")
            .defaultSuccessUrl("/wel",true) // Redirect to a custom URL on successful login
            .permitAll()
            .and()
        .logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/aa")
            .permitAll();
	    return http.build();
		
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(forLogin).passwordEncoder(encoder);
		
	}

}
