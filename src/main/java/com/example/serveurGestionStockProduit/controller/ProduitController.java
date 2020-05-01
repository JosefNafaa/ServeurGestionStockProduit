package com.example.serveurGestionStockProduit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serveurGestionStockProduit.entity.Produit;

@RestController()
@RequestMapping("/api/produit")
//@CrossOrigin("*")
public class ProduitController extends CrudController<Produit, Long>{

	
	
}
