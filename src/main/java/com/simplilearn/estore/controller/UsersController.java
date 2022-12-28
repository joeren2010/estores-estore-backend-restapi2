package com.simplilearn.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.service.UsersService;

@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("users") 		//map url to users webpage = http://localhost:9090/users
@CrossOrigin					//to address CORS issues
public class UsersController {
	//instantiates class using autowired
	@Autowired
	UsersService usersService;
}
