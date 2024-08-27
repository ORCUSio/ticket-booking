package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;



@RestController
@RequestMapping("/user")
public class UserController {
	UserServiceImpl userv;
	public UserController(UserServiceImpl userv) {
		super();
		this.userv = userv;
	}
	
	@PostMapping("/save")
	public String insert(@RequestBody User b1) {
		return userv.insert(b1);
	}
	
	@PostMapping("/updatelast")
	public void updatelastLogin(int uid, Date date) {
		userv.updateLastLogin(uid, date);
	}
	

}
