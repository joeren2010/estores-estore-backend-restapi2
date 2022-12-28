package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.repository.UsersRepository;


@Service
public class UsersService {
	//instantiates interface using autowired
	@Autowired
	UsersRepository usersRepository;
}
