package com.neoris.modelo;

import com.neoris.modelo.clase.abstracta.Vehiculo;

public class Avion extends Vehiculo {

	public Avion(String color, String marca, String modelo, Rueda rueda) {
		super(color, marca, modelo, rueda);
	}

	@Override
	public void encender() {
		System.out.println("hago checos magicos");

	}

	@Override
	public void moverse() {

		System.out.println("vuelva vuela");
	}

}
