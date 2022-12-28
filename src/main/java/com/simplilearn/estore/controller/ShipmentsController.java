package com.simplilearn.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.service.ShipmentsService;

@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("shipments") 		//map url to shipments webpage = http://localhost:9090/shipments
@CrossOrigin					//to address CORS issues
public class ShipmentsController {
	//instantiates class using autowired
	@Autowired
	ShipmentsService shipmentsService;
}
