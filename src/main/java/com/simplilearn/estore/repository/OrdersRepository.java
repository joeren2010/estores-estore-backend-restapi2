package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.simplilearn.estore.entity.Orders;


@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	//JPQL Query to select ord from your entity class e.g: "Orders.java" 	
	@Query("select ord from Orders ord where ord.name > :name")
	//java method to search orders by name from list of orders
	public List<Orders> searchOrdersByName(@Param("name") String name);
}
