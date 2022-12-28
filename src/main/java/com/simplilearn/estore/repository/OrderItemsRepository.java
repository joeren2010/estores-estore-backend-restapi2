package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.entity.OrderItems;


@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer>{
	//JPQL Query to select itm from your entity class e.g: "OrderItems.java" 
	@Query("select itm from OrderItems itm where itm.price > :price")
	//java method to search orderitems by price from list of orderitems
	public List<OrderItems> searchOrderItemsByPrice(@Param("price") int price);
}
