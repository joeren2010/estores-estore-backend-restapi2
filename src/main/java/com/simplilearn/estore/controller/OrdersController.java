package com.simplilearn.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.service.OrdersService;

@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("orders") 		//map url to orders webpage = http://localhost:9090/orders
@CrossOrigin					//to address CORS issues
public class OrdersController {
	//instantiates class using autowired
	@Autowired
	OrdersService ordersService;

}
