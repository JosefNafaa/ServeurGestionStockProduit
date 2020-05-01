package com.example.serveurGestionStockProduit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serveurGestionStockProduit.entity.Role;
import com.example.serveurGestionStockProduit.entity.User;
import com.example.serveurGestionStockProduit.repository.RoleRepository;
import com.example.serveurGestionStockProduit.util.RoleEnum;

@RestController
@RequestMapping("/api/crud_user")
public class CrudUserController extends CrudController<User, Long> {

	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping
	public List<User> getAll(){
		List<User> users = super.getAll();
		users.forEach(user -> user.setPassword(null));
		return users;
	}
	
	public void add(@RequestBody User user) {
		Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
		user.setRoles(Arrays.asList(role));
		user.setEnable(true);
		super.add(user);
	}
	
}
