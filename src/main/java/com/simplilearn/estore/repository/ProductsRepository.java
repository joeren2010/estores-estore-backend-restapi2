package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.entity.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
	//JPQL Query to select prd from your entity class e.g: "Products.java" 
	@Query("select prd from Products prd where prd.price > :price")
	//java method to search products by price from list of products
	public List<Products> searchProductByPrice(@Param("price") int price);
}
