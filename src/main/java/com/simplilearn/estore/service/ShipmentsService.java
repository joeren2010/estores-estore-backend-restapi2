package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.ShipmentsRepository;


@Service
public class ShipmentsService {
	//instantiates interface using autowired
	@Autowired
	ShipmentsRepository shipmentsRepository;
}
