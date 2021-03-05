package com.clancorp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Duelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7998207531074295034L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	private JugadorEnLiga player1;
	
	@OneToOne
	private JugadorEnLiga player2;
	
	@Column(name = "resultado_player_1")
	private Integer resultadoPlayer1;
	
	@Column(name = "resultado_player_2")
	private Integer resultadoPlayer2;
	
	@ManyToOne
	@JoinColumn(name = "duelos_por_ligas")
	private DuelosPorLigas dueloPorLiga;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public JugadorEnLiga getPlayer1() {
		return player1;
	}

	public void setPlayer1(JugadorEnLiga player1) {
		this.player1 = player1;
	}

	public JugadorEnLiga getPlayer2() {
		return player2;
	}

	public void setPlayer2(JugadorEnLiga player2) {
		this.player2 = player2;
	}

	public Integer getResultadoPlayer1() {
		return resultadoPlayer1;
	}

	public void setResultadoPlayer1(Integer resultadoPlayer1) {
		this.resultadoPlayer1 = resultadoPlayer1;
	}

	public Integer getResultadoPlayer2() {
		return resultadoPlayer2;
	}

	public void setResultadoPlayer2(Integer resultadoPlayer2) {
		this.resultadoPlayer2 = resultadoPlayer2;
	}

	public DuelosPorLigas getDueloPorLiga() {
		return dueloPorLiga;
	}

	public void setDueloPorLiga(DuelosPorLigas dueloPorLiga) {
		this.dueloPorLiga = dueloPorLiga;
	}
	

}
