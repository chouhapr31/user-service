package com.example.demo.model;

import java.util.List;

public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", add=" + add + "]";
	}

	private int id;
	private String userName;
	private String add;
	private List<Integer> productId;
	
	
	

	public User(int id, String userName, String add, List<Integer> products) {
		super();
		this.id = id;
		this.userName = userName;
		this.add = add;
		this.productId = products;
	}

	public List<Integer> getProducts() {
		return productId;
	}

	public void setProducts(List<Integer> products) {
		this.productId = products;
	}

	public User(int id, String userName, String add) {
		super();
		this.id = id;
		this.userName = userName;
		this.add = add;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
