package com.abir.montres.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abir.montres.entities.Categorie;
import com.abir.montres.entities.Montre;

public interface MontreRepository extends JpaRepository<Montre, Long> {
	List<Montre> findByNomMontre(String nom);
	List<Montre> findByNomMontreContains(String nom);
	@Query("select p from Montre p where p.nomMontre like %?1 and p.prixMontre > ?2")
	List<Montre> findByNomPrix (String nom, Double prix);
	@Query("select p from Montre p where p.categorie = ?1")
	List<Montre> findByCategorie (Categorie categorie);
	List<Montre> findByCategorieIdCat(Long id);
	List<Montre> findByOrderByNomMontreAsc();
	@Query("select p from Montre p order by p.nomMontre ASC, p.prixMontre DESC")
	List<Montre> trierMontresNomsPrix ();
}