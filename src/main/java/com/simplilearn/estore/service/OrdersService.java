package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.OrdersRepository;


@Service
public class OrdersService {
	//instantiates interface using autowired
	@Autowired
	OrdersRepository ordersRepository;
}
