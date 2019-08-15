package com.neoris.modelo;

public class Avion implements Motor {

	@Override
	public void encender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void caballos() {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void combustible(T tobjeto) {

		if (tobjeto instanceof Integer) {
			System.out.println("SI SOY DE TIPO INTEGER!");
			
		}
		System.out.println(tobjeto);

	}

}
