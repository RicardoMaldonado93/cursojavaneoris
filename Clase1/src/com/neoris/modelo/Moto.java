package com.neoris.modelo;

public class Moto implements Motor {

	@Override
	public void encender() {
		System.out.println("Enciende sin cebador");
	}

	@Override
	public void caballos() {

		System.out.println("24 hp");
	}

	@Override
	public <T> void combustible(T tobjeto) {
		// TODO Auto-generated method stub
		
	}

}
