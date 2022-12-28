package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.CartRepository;

@Service
public class CartService {
	//instantiates interface using autowired
	@Autowired
	CartRepository cartRepository;
	
}
