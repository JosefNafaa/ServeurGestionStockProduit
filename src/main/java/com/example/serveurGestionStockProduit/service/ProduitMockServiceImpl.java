package com.example.serveurGestionStockProduit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.serveurGestionStockProduit.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService {

	private List<Produit> produits;

	public ProduitMockServiceImpl() {
		super();
		produits = new ArrayList<>();
		produits.add(new Produit("livre", 10, 100));
		produits.add(new Produit("souris", 5, 9));
		produits.add(new Produit("clavier", 10, 15));

	}

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit p) {
		produits.add(p);

	}

	@Override
	public void updateProduit(Produit p) {
		produits.remove(p);
		produits.add(p);

	}

	@Override
	public void deleteProduit(String ref) {
		Produit pr = new Produit();
		pr.setRef(ref);
		produits.remove(pr);

	}

}