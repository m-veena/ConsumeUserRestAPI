package com.mveeva.consumeAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mveeva.consumeAPI.model.User;

@RestController
public class UserController {
	
	
	@GetMapping("/user/{id}")
	public String getUsersData(@PathVariable Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://jsonplaceholder.typicode.com/users/"+id;
		User user = restTemplate.getForObject(uri, User.class);
		System.out.println("User: "+user.id()+" : "+user.email()+"  :"+user.name());
		return "User details page";
	}

}
