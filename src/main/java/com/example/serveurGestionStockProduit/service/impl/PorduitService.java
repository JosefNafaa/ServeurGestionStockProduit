package com.example.serveurGestionStockProduit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.serveurGestionStockProduit.entity.Produit;
import com.example.serveurGestionStockProduit.repository.ProduitRepository;
import com.example.serveurGestionStockProduit.service.ICrudService;

@Service
@Primary
public class PorduitService implements ICrudService<Produit, Long> {
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void add(Produit p) {
		produitRepository.save(p);

	}

	@Override
	public void update(Produit p) {
		produitRepository.save(p);

	}

	@Override
	public void delete(Long id) {
		Produit pr=new Produit();
		pr.setId(id);
		produitRepository.delete(pr);
	

	}
	
	@Override
	public void saveAll(Iterable<Produit> iterable) {
		produitRepository.saveAll(iterable);	
	}

}
