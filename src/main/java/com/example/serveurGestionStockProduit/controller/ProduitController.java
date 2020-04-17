package com.example.serveurGestionStockProduit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serveurGestionStockProduit.entity.Produit;
import com.example.serveurGestionStockProduit.service.IProduitService;

@RestController()
@RequestMapping("/api/produit")
@CrossOrigin("*")
public class ProduitController {

	@Autowired
	private IProduitService produitService;

	@GetMapping
	public List<Produit> getProduits() {
		return produitService.getProduits();
	}

	@PostMapping
	public void addProdui(@RequestBody Produit p) {
		produitService.addProduit(p);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit p) {
		produitService.updateProduit(p);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		produitService.deleteProduit(id);
	}
	
}
