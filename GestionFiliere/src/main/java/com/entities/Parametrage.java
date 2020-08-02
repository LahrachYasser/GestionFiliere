package com.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parametrage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long parametrage_id;
	public Long getParametrage_id() {
		return parametrage_id;
	}

	public void setParametrage_id(Long parametrage_id) {
		this.parametrage_id = parametrage_id;
	}

	private Long code_apoger;
	private String code_semestre;
	private String nom_module;
	private Long num_module;
	private String date_absence;

	public Parametrage(String date_absence) {
		super();
		this.date_absence = date_absence;
	}

	public String getDate_absence() {
		return date_absence;
	}

	public void setDate_absence(String date_absence) {
		this.date_absence = date_absence;
	}

	@ManyToOne
	private Annee annee;

	public Long getCode_apoger() {
		return code_apoger;
	}

	public void setCode_apoger(Long code_apoger) {
		this.code_apoger = code_apoger;
	}

	public String getCode_semestre() {
		return code_semestre;
	}

	public void setCode_semestre(String code_semestre) {
		this.code_semestre = code_semestre;
	}

	public String getNom_module() {
		return nom_module;
	}

	public void setNom_module(String nom_module) {
		this.nom_module = nom_module;
	}

	public Long getNum_module() {
		return num_module;
	}

	public void setNum_module(Long num_module) {
		this.num_module = num_module;
	}

	public Parametrage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parametrage(String code_semestre, String nom_module) {
		super();
		this.code_semestre = code_semestre;
		this.nom_module = nom_module;
	}
/*
	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}
*/
}
