package com.simplilearn.estore.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
	//add fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryid")
	private int categoryId;
	@Column(name = "categoryname")
	private String categoryName;
	@Column(name = "categorydescription")
	private String categoryDescription;
	@Column(name = "categoryimageurl")
	private String categoryImageUrl;
	private int active;
	@Column(name = "addedon")
	private Date addedOn;

	
	//default constructor
	public Categories() {
		super();
	}

	
	//parameterized constructor
	public Categories(int categoryId, String categoryName, String categoryDescription, String categoryImageUrl,
			int active, Date addedOn) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
		this.active = active;
		this.addedOn = addedOn;
	}

	
	//getter and setter methods
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}

	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}


	//override to-string method
	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + ", categoryImageUrl=" + categoryImageUrl + ", active=" + active + ", addedOn="
				+ addedOn + "]";
	}	
}
