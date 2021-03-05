package com.clancorp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Periodo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6054221856000880056L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "periodo")
	private List<Liga> ligas;
	
	@Temporal(TemporalType.DATE)
	private Date periodo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Liga> getLigas() {
		return ligas;
	}

	public void setLigas(List<Liga> ligas) {
		this.ligas = ligas;
	}

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}
}
