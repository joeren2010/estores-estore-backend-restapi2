package com.simplilearn.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.entity.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	//JPQL Query to select usr from your entity class e.g: "Users.java" 
	@Query("select usr from Users usr where usr.email = :emailname and usr.password = :pass")
	//java method to sign-in using email address and password
	public Users signIn(@Param("emailname") String email, @Param("pass") String password);
}
