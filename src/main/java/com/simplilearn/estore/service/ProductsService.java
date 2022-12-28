package com.simplilearn.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.entity.Products;
import com.simplilearn.estore.repository.ProductsRepository;



@Service
public class ProductsService {
	//instantiates interface using autowired
	@Autowired
	ProductsRepository productsRepository;
	
	public String storeProduct(Products product) {
		productsRepository.save(product);			//insert query = similar to pojo
		return "Product Details stored successfully";
	}
	
	public List<Products> findAllProduct() {
		return productsRepository.findAll();			//select query 
	}
	
	public List<Products> findProductByPrice(int price){
		return productsRepository.searchProductByPrice(price);
	}
	
	public String findProductById(int productid) {
		//using "optional" method
		Optional<Products> result = productsRepository.findById(productid);			//using primary key
		if(result.isPresent()) {
			Products pp = result.get();
			return pp.toString();
		}else {
			return "Product not present";
		}
	}
	
	public String updateProductDetails(Products product) {
		//using "optional" method
		Optional<Products> result = productsRepository.findById(product.getProductId());		//using primary key
		if(result.isPresent()) {
			Products pp	= result.get();
			pp.setPrice(product.getPrice());
			/*
			 * 	we can update more property 
			 * 
			 */
			productsRepository.saveAndFlush(pp);			//flush = clears-out the repo of any buffer data
			return "Product Details updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteProductUsingId(int productid) {
		//using "optional" method
		Optional<Products> result = productsRepository.findById(productid);              //using primary key
		if(result.isPresent()) {
			Products pp = result.get();
			productsRepository.deleteById(pp.getProductId());
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteAllProduct() {
		productsRepository.deleteAll();
		return "Add product deleted";
	}
}
