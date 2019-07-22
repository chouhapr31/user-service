package com.example.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class UserView {
	private String userName;
	private String add;

	private List<Product> list;

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

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

}
