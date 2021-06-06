package com.online.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String productName;
	
	@Column
	private String brand;
	
	@Column
	private float price;
	
	@Column
	private String description;

	public Product() {
	}
	
	public Product(long id, String productName, String brand, float price, String description) {
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getBrand() {
		return brand;
	}

	public float getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", productName=" + productName + ", brand=" + brand + ", price=" + price
				+ ", description=" + description + "]";
	}
}
