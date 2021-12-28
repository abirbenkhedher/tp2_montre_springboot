package com.abir.montres.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity

public class Montre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMontre;
	private String nomMontre;
	private Double prixMontre;
	@ManyToOne
	private Categorie categorie;
	public Montre() {
	super();
	}
	
	public Montre(String nomMontre, Double prixMontre) {
	super();
	this.nomMontre = nomMontre;
	this.prixMontre = prixMontre;
	}
	
	public Long getIdMontre() {
		return idMontre;
	}
	
	public void setIdMontre(Long idMontre) {
		this.idMontre = idMontre;
		}
		public String getNomMontre() {
		return nomMontre;
		}
		public void setNomMontre(String nomMontre) {
		this.nomMontre = nomMontre;
		}
		public Double getPrixMontre() {
		return prixMontre;
		}
		public void setPrixMontre(Double prixMontre) {
		this.prixMontre = prixMontre;
		}
		
		
		@Override
		public String toString() {
		return "Montre [idMontre=" + idMontre + ", nomMontre=" +

		nomMontre + ", prixMontre=" + prixMontre+  "]";

		}
}
