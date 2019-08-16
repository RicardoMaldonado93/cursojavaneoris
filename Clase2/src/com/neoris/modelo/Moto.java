package com.neoris.modelo;

import com.neoris.modelo.clase.abstracta.Vehiculo;

public class Moto extends Vehiculo {

	public Moto(String color, String marca, String modelo, Rueda rueda) {
		super(color, marca, modelo, rueda);
	}

	@Override
	public void encender() {
		System.out.println(" a patada ");
	}

	@Override
	public void moverse() {

		System.out.println("haciendo willy ameo'");
	}

}
