package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.CategoriesRepository;

@Service
public class CategoriesService {
	//instantiates interface using autowired
	@Autowired
	CategoriesRepository categoriesRepository;
}
