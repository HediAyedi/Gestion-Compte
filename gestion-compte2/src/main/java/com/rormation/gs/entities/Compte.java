package com.rormation.gs.entities;
// Generated 27 oct. 2019 13:28:41 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Compte generated by hbm2java
 */
@Entity
@Table(name = "compte", catalog = "formation_db")
public class Compte implements java.io.Serializable {

	private Integer id;
	private Personne personne;
	private String type;
	private double solde;
	private Date date;

	public Compte() {
		//pbjet fi wost objet
		personne = new Personne();
	}

	public Compte(Personne personne, String type, double solde, Date date) {
		this.personne = personne;
		this.type = type;
		this.solde = solde;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)//eager yjib compte w persoone mte3ou 
	@JoinColumn(name = "cin", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Column(name = "type", nullable = false)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "solde", nullable = false, precision = 22, scale = 0)
	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Temporal(TemporalType.DATE)//timestump
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
