package com.nadhem.produit;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nadhem.produit.entities.Categorie;
import com.nadhem.produit.entities.Produit;
import com.nadhem.produit.repos.ProduitRepository;

@SpringBootTest
class ProduitApplicationTests {
	
	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("Ps 4",1200.000,new Date());
	produitRepository.save(prod);
	}
	
	 @Test
	 public void testFindProduit()
	 {
	 Produit p = produitRepository.findById(1L).get();
	 System.out.println(p);
	 }
	 
	 @Test
	 public void testUpdateProduit()
	 {
	 Produit p = produitRepository.findById(1L).get();
	 p.setPrixProduit(2000.0);
	 produitRepository.save(p);
	 System.out.println(p);
	 }
	 @Test
	 public void testDeleteProduit()
	 {
		 produitRepository.deleteById(1L);
	 }
	 
	 @Test
	 public void testFindAllProduit()
	 {
	   List<Produit> prods =produitRepository.findAll();
	   for (Produit p:prods)
		   System.out.println(p);

	 }
	 
	 @Test
	 public void testFindProduitByNom()
	 {
	 List<Produit> prods = produitRepository.findByNomProduit("PS 4");
	 for (Produit p:prods)
		   System.out.println(p);
	
	 }
	 @Test
	 public void testFindProduitByNomContains()
	 {
	 List<Produit> prods = produitRepository.findByNomProduitContains("P");
	 for (Produit p:prods)
		   System.out.println(p);
	
	 }
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Produit> prods = produitRepository.findByNomPrix("Ps 4", 1000.0);
	 for (Produit p : prods)
	     {
	           System.out.println(p);
	     }
	 }
	 
	 @Test
	 public void testfindByCategorie()
	 {
	 Categorie cat = new Categorie();
	 cat.setIdCat(1L);
	 List<Produit> prods = produitRepository.findByCategorie(cat);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomProduitAsc()
	 {
	 List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testTrierProduitsNomsPrix()
	 {
	 List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }



	 }




