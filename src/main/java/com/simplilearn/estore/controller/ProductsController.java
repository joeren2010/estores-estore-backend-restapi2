package com.simplilearn.estore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.entity.Products;
import com.simplilearn.estore.service.ProductsService;

@RestController						//use rest-controller for frameworks like angular, etc
@RequestMapping("products") 		//map url to products webpage = http://localhost:9090/products
@CrossOrigin						//to address CORS issues
public class ProductsController {
	//instantiates class using autowired
	@Autowired
	ProductsService productsService;
	
	// http://localhost:9090/products/storeProduct 
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)	//pass data in json format 
	//@request-body binds the http request values to the entity class
	public String storeProduct(@RequestBody Products product) {
		System.out.println(product);
		return productsService.storeProduct(product);
	}
	
	// http://localhost:9090/products/findAllProducts
	@GetMapping(value = "findAllProducts",produces = MediaType.APPLICATION_JSON_VALUE)		//pass data in json format
	public List<Products> findAllProduct() {
		return productsService.findAllProduct();
	}
	
	// http://localhost:9090/products/findProductById/1 or // http://localhost:9090/products/findProductById/100
	@GetMapping(value = "findProductById/{pid}")
	//@pathvariable extracts data directly from the uri e.g: pid = 1 or 100 as above
	public String findProductById(@PathVariable("pid") int pid) {
		return productsService.findProductById(pid);
	}
	
	// http://localhost:9090/products/findProductByPrice/35000
	@GetMapping(value = "findProductByPrice/{price}")
	//@pathvariable extracts data directly from the uri e.g: price = 35000 as above
	public List<Products> findProductByPrice(@PathVariable("price") int price) {
		return productsService.findProductByPrice(price);
	}
	
	// http://localhost:9090/products/updateProduct
	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)		//pass data in json format
	//@request-body binds the http request values to the entity class
	public String updateProduct(@RequestBody Products product) {
		return productsService.updateProductDetails(product);
	}
	
	// http://localhost:9090/products/deleteProductById/1
	@DeleteMapping(value = "deleteProductById/{pid}")
	//@pathvariable extracts data directly from the uri e.g: pid = 1 as above
	public String deletetProductById(@PathVariable("pid") int pid) {
		return productsService.deleteProductUsingId(pid);
	}
	
	// http://localhost:9090/products/deleteAll
	@DeleteMapping(value = "deleteAll")
	public String deletetAll() {
		return productsService.deleteAllProduct();
	}
}
