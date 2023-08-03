package com.nms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nms.bo.UsersBo;
import com.nms.service.UserService;

@SpringBootApplication
public class NNmsSecurity1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NNmsSecurity1Application.class, args);
	}

//	@Autowired
//	UserService service;
	
	@Override
	public void run(String... args) throws Exception {
		
//		UsersBo save = service.save(new UsersBo("ram", "ram123", "admin"));
//		System.out.println(save);
	}

}
