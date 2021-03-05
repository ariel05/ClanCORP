package com.clancorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Liga implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6504393346258978075L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nombre;
	
	@Column(name = "is_de")
	private Boolean isDE;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "liga")
	private List<JugadorEnLiga> jugadores;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "liga")
	private List<DuelosPorLigas> duelosPorLiga;
	
	@ManyToOne
	@JoinColumn(name = "periodo")
	private Periodo periodo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<JugadorEnLiga> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<JugadorEnLiga> jugadores) {
		this.jugadores = jugadores;
	}

	public List<DuelosPorLigas> getDuelosPorLiga() {
		return duelosPorLiga;
	}

	public void setDuelosPorLiga(List<DuelosPorLigas> duelosPorLiga) {
		this.duelosPorLiga = duelosPorLiga;
	}

	public Boolean getIsDE() {
		return isDE;
	}

	public void setIsDE(Boolean isDE) {
		this.isDE = isDE;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
}
