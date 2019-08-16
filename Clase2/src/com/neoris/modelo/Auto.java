package com.neoris.modelo;

import com.neoris.modelo.clase.abstracta.Vehiculo;

public class Auto extends Vehiculo {

	public Auto(String color, String marca, String modelo, Rueda rueda) {
		super(color, marca, modelo, rueda);
	}

	@Override
	public void encender() {
		System.out.println("prum prum");
	}

	@Override
	public void moverse() {

		System.out.println("run run");
	}

}
