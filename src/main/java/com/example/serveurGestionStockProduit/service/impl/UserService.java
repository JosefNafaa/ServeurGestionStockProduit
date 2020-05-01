package com.example.serveurGestionStockProduit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.serveurGestionStockProduit.entity.User;
import com.example.serveurGestionStockProduit.repository.UserRepository;
import com.example.serveurGestionStockProduit.service.ICrudService;

@Service
@Primary
public class UserService implements ICrudService<User, Long> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		System.out.println("tous les utilisateurs");
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
	
	@Override
	public void saveAll(Iterable<User> iterable) {
		userRepository.saveAll(iterable);
	}

}
