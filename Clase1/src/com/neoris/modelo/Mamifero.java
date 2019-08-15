package com.neoris.modelo;

/*
 * Caracteristicas no se instancia
 * sirve para dar comportamiento a las clases que
 * hereden de esta clase
 */
public abstract class Mamifero {

	private String raza;
	
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public abstract void comunicarse();
	
	public void caminar() {
		System.out.println("Estoy caminando");
	}

	@Override
	public String toString() {
		return "Mamifero [raza=" + raza + "]";
	}
	
	
}
