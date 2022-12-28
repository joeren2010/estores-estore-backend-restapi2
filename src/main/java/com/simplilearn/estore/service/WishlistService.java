package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.WishlistRepository;


@Service
public class WishlistService {
	//instantiates interface using autowired
	@Autowired
	WishlistRepository wishlistRepository;
}
