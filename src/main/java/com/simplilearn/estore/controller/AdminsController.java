package com.simplilearn.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.entity.Admins;
import com.simplilearn.estore.service.AdminsService;


@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("admins") 		//map url to admins webpage = http://localhost:9090/admins
@CrossOrigin					//to address CORS issues
public class AdminsController {
	//instantiates class using autowired
	@Autowired
	AdminsService adminsService;
	
	
	//code for admin sign-in
	//map url to admin sign-in webpage = http://localhost:9090/admins/signIn
	@PostMapping(value = "signIn")		
	//@request-body binds the http request values to the entity class
	public String signInAdmin(@RequestBody Admins admin) {
		return adminsService.signInAdmin(admin);
	}
}
