package com.abir.montres.service;

import java.util.List;

import com.abir.montres.entities.Categorie;
import com.abir.montres.entities.Montre;

public interface MontreService {
	Montre saveMontre(Montre p);
	Montre updateMontre(Montre p);
void deleteMontre(Montre p);
void deleteMontreById(Long id);
Montre getMontre(Long id);
List<Montre> getAllMontres();
List<Montre> findByNomMontre(String nom);
List<Montre> findByNomMontreContains(String nom);
List<Montre> findByNomPrix (String nom, Double prix);
List<Montre> findByCategorie (Categorie categorie);
List<Montre> findByCategorieIdCat(Long id);
List<Montre> findByOrderByNomMontreAsc();
List<Montre> trierMontresNomsPrix();
}