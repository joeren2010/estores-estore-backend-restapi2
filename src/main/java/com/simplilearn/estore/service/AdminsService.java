package com.simplilearn.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.entity.Admins;
import com.simplilearn.estore.repository.AdminsRepository;


@Service
public class AdminsService {
	//instantiates interface using autowired
	@Autowired
	AdminsRepository adminsRepository;
	
	//code for admin sign-in
	public String signInAdmin(Admins admin) {
		if(adminsRepository.signIn(admin.getEmail(), admin.getPassword())!=null) {
			return "success";
		}else {
			return "failure";
		}
	}

}
