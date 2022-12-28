package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.OrderItemsRepository;

@Service
public class OrderItemsService {
	//instantiates interface using autowired
	@Autowired
	OrderItemsRepository orderitemsRepository;
}
