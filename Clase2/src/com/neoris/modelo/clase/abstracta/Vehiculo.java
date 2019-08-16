package com.neoris.modelo.clase.abstracta;

import com.neoris.modelo.Rueda;

public abstract class Vehiculo {

	private String color;
	private String marca;
	private String modelo;
	private Rueda rueda;
	
	

	public Vehiculo(String color, String marca, String modelo, Rueda rueda) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.rueda = rueda;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Rueda getRueda() {
		return rueda;
	}

	public void setRueda(Rueda rueda) {
		this.rueda = rueda;
	}
	
	public abstract void encender();
	
	public void apagar() {
		System.out.println("me apago magicamente");
	}
	
	public abstract void moverse();

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", rueda=" + rueda + "]";
	}
	
	
	

}
