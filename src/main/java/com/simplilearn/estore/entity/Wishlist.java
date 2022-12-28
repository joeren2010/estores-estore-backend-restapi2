package com.simplilearn.estore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Wishlist {
	//add fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="wishlistid")
	private int wishlistId;
	@Column(name="productid")
	private int productId;
	@Column(name="userid")
	private int userId;
	
	
	//default constructor
	public Wishlist() {
		super();
	}

	
	//parameterized constructor
	public Wishlist(int wishlistId, int productId, int userId) {
		super();
		this.wishlistId = wishlistId;
		this.productId = productId;
		this.userId = userId;
	}

	
	//getter and setter methods
	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	//override to-string method
	@Override
	public String toString() {
		return "Wishlist [wishlistId=" + wishlistId + ", productId=" + productId + ", userId=" + userId + "]";
	}
}
