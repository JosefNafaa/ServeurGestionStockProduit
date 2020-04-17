package com.example.serveurGestionStockProduit.service;

import java.util.List;

import com.example.serveurGestionStockProduit.entity.Produit;

public interface IProduitService {

	List<Produit> getProduits();

	void addProduit(Produit p);

	void updateProduit(Produit p);

	void deleteProduit(Long id);

}
