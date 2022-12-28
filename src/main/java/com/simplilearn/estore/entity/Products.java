package com.simplilearn.estore.entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OrderColumn;

@Entity
public class Products {
	//add fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productId;
	@Column(name = "producttitle")
	private String productTitle;
	@Column(name = "productdescription")
	private String productDescription;
	@Column(name = "productcode")
	private String productCode;
	
	@ElementCollection							//stores a list of values as an entity
	@OrderColumn(name="imageid")				//ensures the order in the column is maintained
	@CollectionTable(name="imageinfo")			//defines the table name
	@Lob										//specifies the datatype "blob" type
	@Column(columnDefinition="LONGBLOB")		//ensures "longblob" is the assigned "blob" type
	private String images[];					//array-field for array-table
	//private List<String> images;
	
	@Column(name = "thumbnailimage")
	private int thumbnailImage;
	private int price;	
	@Column(name = "addedon")
	private LocalDate addedOn;
	private int rating;
	
	
	//default constructor
	public Products() {
		super();
	}

	
	//parameterized constructor
	public Products(int productId, String productTitle, String productDescription, String productCode, String[] images,
			int thumbnailImage, int price, LocalDate addedOn, int rating) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.productDescription = productDescription;
		this.productCode = productCode;
		this.images = images;
		this.thumbnailImage = thumbnailImage;
		this.price = price;
		this.addedOn = addedOn;
		this.rating = rating;
	}


	//getter and setter methods
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public int getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(int thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(LocalDate addedOn) {
		this.addedOn = addedOn;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


	//override to-string method
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productTitle=" + productTitle + ", productDescription="
				+ productDescription + ", productCode=" + productCode + ", images=" + Arrays.toString(images)
				+ ", thumbnailImage=" + thumbnailImage + ", price=" + price + ", addedOn=" + addedOn + ", rating="
				+ rating + "]";
	}
}
