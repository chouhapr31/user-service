package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.model.UserView;

@Component
public class UserRepository {

	private List<User> users = new ArrayList<>();

	public UserRepository() {
		users.add(new User(1, "Prashant", "Ujjain", Arrays.asList(1, 2)));
		users.add(new User(2, "Sandeep", "Ratlam", Arrays.asList(1, 3, 4)));
		users.add(new User(3, "Abhilasha", "Dewas", Arrays.asList(2, 3, 4)));
		users.add(new User(4, "Prashant", "Pune", Arrays.asList(1, 2)));
	}

	@Autowired
	RestTemplate rest;

	public List<User> getUsers() {
		return users;
	}

	public UserView getUser(int id) {

		User u1 = (User) users.stream().filter(x -> x.getId() == id).findAny().get();
		
		List<Integer> list=u1.getProducts();
		/* rest.getForObject("http://localhost:8091/products/".x, Product.class); */
		 
		UserView uv=new UserView();
		uv.setUserName(u1.getUserName());
		uv.setAdd(u1.getAdd());
		 List<Product> plist=new ArrayList<Product>();
		 for (Integer x : list) {
			 
			 Product p=rest.getForObject("http://PRODUCTS/products/"+x, Product.class);
			 plist.add(p);
			 System.out.println(p);
		}
		
		uv.setList(plist);
		/*
		 * list.stream().map(x -> rest.getForObject("http://localhost:8091/products/".x,
		 * Product.class));
		 */
		return uv;

		/*
		 * Product p=rest.getForObject("http://localhost:8091/products/1",
		 * Product.class); System.out.println(p); return users.stream().map(x ->
		 * x.getProducts()).
		 */
		/* return new User(); */
	}

	public static void main(String[] args) {
		UserRepository u = new UserRepository();
		System.out.println(u.getUser(1));
	}

}
