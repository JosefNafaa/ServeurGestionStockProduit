package com.example.serveurGestionStockProduit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serveurGestionStockProduit.entity.Produit;
import com.example.serveurGestionStockProduit.service.ICrudService;

@RestController()
@RequestMapping("/api/produit")
//@CrossOrigin("*")
public class ProduitController {

	@Autowired
	private ICrudService<Produit, Long> produitService;

	@GetMapping
	public List<Produit> getAll() {
		return produitService.getAll();
	}

	@PostMapping
	public void add(@RequestBody Produit p) {
		produitService.add(p);
	}
	
	@PutMapping
	public void update(@RequestBody Produit p) {
		produitService.update(p);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		produitService.delete(id);
	}
	
}
