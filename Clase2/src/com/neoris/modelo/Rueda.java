package com.neoris.modelo;

public class Rueda {

	private String marca;
	private int rodado;
	private TipoRueda ipo;

	public String getMarca() {
		return marca;
	}

	public int getRodado() {
		return rodado;
	}

	public TipoRueda getIpo() {
		return ipo;
	}

	public Rueda(String marca, int rodado, TipoRueda ipo) {
		super(); // --> constructor de la clase object
		this.marca = marca;
		this.rodado = rodado;
		this.ipo = ipo;
	}

	@Override
	public String toString() {
		return "Rueda [marca=" + marca + ", rodado=" + rodado + ", ipo=" + ipo + "]";
	}

	
	
	
}
