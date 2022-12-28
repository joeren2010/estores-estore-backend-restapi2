package com.simplilearn.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.entity.Admins;

@Repository
public interface AdminsRepository extends JpaRepository<Admins, Integer>{

	//JPQL Query to select adm from your entity class e.g: "Admins.java" 
	@Query("select adm from Admins adm where adm.email = :emailname and adm.password = :pass")
	//java method to sign-in using email address and password
	public Admins signIn(@Param("emailname") String email, @Param("pass") String password);
}
