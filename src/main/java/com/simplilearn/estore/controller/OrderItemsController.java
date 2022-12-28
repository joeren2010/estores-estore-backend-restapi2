package com.simplilearn.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.service.OrderItemsService;

@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("orderitems") 		//map url to orderitems webpage = http://localhost:9090/orderitems
@CrossOrigin					//to address CORS issues
public class OrderItemsController {
	//instantiates class using autowired
	@Autowired
	OrderItemsService orderitemsService;
}
