package com.example.demo.model;

import org.springframework.stereotype.Component;

/**
 * t
 * 
 * @author prashantc
 *
 */

/**
 * @author prashantc
 *
 */
@Component
public class Product {

	private int id;
	private String name;
	private int price;
	private int userId;

	public Product() {
		super();
		// TODO Auto-generated constructor stub v
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", userId=" + userId + "]";
	}

	// o
	public Product(int id, String name, int price, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	// r
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
