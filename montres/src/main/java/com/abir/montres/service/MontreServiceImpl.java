package com.abir.montres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abir.montres.entities.Categorie;
import com.abir.montres.entities.Montre;
import com.abir.montres.repos.MontreRepository;

@Service
public class MontreServiceImpl implements MontreService {
@Autowired
MontreRepository montreRepository;
@Override
public Montre saveMontre(Montre p) {
return montreRepository.save(p);
}
@Override
public Montre updateMontre(Montre p) {
return montreRepository.save(p);
}
@Override
public void deleteMontre(Montre p) {
	montreRepository.delete(p);
}
@Override
public void deleteMontreById(Long id) {
	montreRepository.deleteById(id);
}
@Override
public Montre getMontre(Long id) {
return montreRepository.findById(id).get();
}
@Override
public List<Montre> getAllMontres() {
return montreRepository.findAll();
}
@Override
public List<Montre> findByNomMontre(String nom) {
	return montreRepository.findByNomMontre(nom);
}

@Override
public List<Montre> findByNomMontreContains(String nom) {
	return montreRepository.findByNomMontreContains(nom);
}

@Override
public List<Montre> findByNomPrix(String nom, Double prix) {
	return montreRepository.findByNomPrix(nom, prix);
}

@Override
public List<Montre> findByCategorie(Categorie categorie) {
	return montreRepository.findByCategorie(categorie);
}
@Override
public List<Montre> findByCategorieIdCat(Long id) {
	return montreRepository.findByCategorieIdCat(id);
}
@Override
public List<Montre> findByOrderByNomMontreAsc() {
	return montreRepository.findByOrderByNomMontreAsc();
}
@Override
public List<Montre> trierMontresNomsPrix() {
	return montreRepository.trierMontresNomsPrix();
}
}
