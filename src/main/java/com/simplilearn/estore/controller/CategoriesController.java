package com.simplilearn.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.estore.service.CategoriesService;

@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("categories") 		//map url to categories webpage = http://localhost:9090/categories
@CrossOrigin					//to address CORS issues
public class CategoriesController {
	//instantiates class using autowired
	@Autowired
	CategoriesService categoriesService;
}
