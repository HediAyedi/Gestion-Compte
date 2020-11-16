package com.rormation.gs.entities;
// Generated 27 oct. 2019 13:28:41 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Personne generated by hbm2java
 */
@Entity
@Table(name = "personne", catalog = "formation_db")
public class Personne implements java.io.Serializable {

	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private Set<Compte> comptes = new HashSet<Compte>(0);

	public Personne() {
	}

	public Personne(String cin, String nom, String prenom, String adresse, String email) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
	}

	public Personne(String cin, String nom, String prenom, String adresse, String email, Set<Compte> comptes) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.comptes = comptes;
	}

	@Id

	@Column(name = "cin", unique = true, nullable = false, length = 14)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "nom", nullable = false, length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "adresse", nullable = false, length = 50)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "email", nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Compte> getComptes() {
		return this.comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

}