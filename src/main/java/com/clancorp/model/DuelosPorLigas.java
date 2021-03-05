package com.clancorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "duelos_por_ligas")
public class DuelosPorLigas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2413062288469454363L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Liga liga;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dueloPorLiga")
	private List<Duelo> duelos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public List<Duelo> getDuelos() {
		return duelos;
	}

	public void setDuelos(List<Duelo> duelos) {
		this.duelos = duelos;
	} 
}
