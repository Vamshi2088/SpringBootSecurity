package com.nms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nms.bo.UsersBo;
import com.nms.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userService;

	@PostMapping("/adduser")
	public UsersBo save(@RequestBody UsersBo usersBo) {
		userService.save(usersBo);
		return usersBo;
	}

	@GetMapping("/hi")
	public String getette() {
		return "loggin";
	}
	@GetMapping("/wel")
	public String getette1() {
		return "welcome";
	}
	@GetMapping("/aa")
	public String login() {
		return "NewFile";
	}

}
