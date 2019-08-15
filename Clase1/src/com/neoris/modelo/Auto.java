package com.neoris.modelo;

public class Auto implements Motor{

	@Override
	public void encender() {
		System.out.println("Electronico");
	}

	@Override
	public void caballos() {
		System.out.println("75hp");
	}

	@Override
	public <T> void combustible(T tobjeto) {
		System.out.println(tobjeto.getClass());
		System.out.println(tobjeto);
		
	}

}
