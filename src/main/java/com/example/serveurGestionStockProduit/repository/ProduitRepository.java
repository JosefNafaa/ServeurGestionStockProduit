package com.example.serveurGestionStockProduit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.serveurGestionStockProduit.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
