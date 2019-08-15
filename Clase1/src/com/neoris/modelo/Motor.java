package com.neoris.modelo;

/*
 * Solo acepta metodos abstracto
 * o variables finales inicializadas
 */
public interface Motor {

	// una constante
	public final String serieMistica="ABC1234";
	public void encender();
	
	public void caballos();

	public <T>void combustible(T tobjeto);

}
