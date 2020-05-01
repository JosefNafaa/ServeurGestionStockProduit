package com.example.serveurGestionStockProduit.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.serveurGestionStockProduit.entity.Produit;
import com.example.serveurGestionStockProduit.service.ICrudService;

@Service
public class ProduitMockServiceImpl  implements ICrudService<Produit, Long> {

	private List<Produit> produits;

	public ProduitMockServiceImpl() {
		super();
		produits = new ArrayList<>();
		produits.add(new Produit("livre", 10, 100));
		produits.add(new Produit("souris", 5, 9));
		produits.add(new Produit("clavier", 10, 15));

	}

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void add(Produit p) {
		produits.add(p);

	}

	@Override
	public void update(Produit p) {
		produits.remove(p);
		produits.add(p);

	}

	@Override
	public void delete(Long id) {
		Produit pr = new Produit();
		pr.setId(id);
		produits.remove(pr);

	}
	@Override
	public void saveAll(Iterable<Produit> iterable) {
		Iterator<Produit> iterator = iterable.iterator();
		if(iterator.hasNext()) {
			produits.add(iterator.next());
		}
	}

}
