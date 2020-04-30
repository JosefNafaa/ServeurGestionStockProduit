package com.example.serveurGestionStockProduit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.serveurGestionStockProduit.entity.User;
import com.example.serveurGestionStockProduit.repository.UserRepository;

public class UserService implements ICrudService<User, Long> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		userRepository.save(user);

	}

	@Override
	public void update(User user) {
		userRepository.save(user);

	}

	@Override
	public void delete(Long id) {
		User user = new User();
		user.setId(id);
		userRepository.delete(user);

	}

}
