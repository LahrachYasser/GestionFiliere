package com.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Annee {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "date")
	private String date;

	@OneToMany(mappedBy = "annee", cascade = CascadeType.ALL)
	private Collection<Parametrage> parametrage;

	public Annee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Annee(String name, String description, String date) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
/*
	@JsonIgnore
	public Collection<Parametrage> getParametrage() {
		return parametrage;
	}

	public void setParametrage(Collection<Parametrage> parametrage) {
		this.parametrage = parametrage;
	}
*/
	
}
