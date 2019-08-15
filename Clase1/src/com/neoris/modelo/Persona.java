package com.neoris.modelo;

public class Persona extends Mamifero {

	// visibilidad , tipo, nombre de la variable
	/*
	 * Encapsulamiento Toda variable privada es accedida por medio de un metodo
	 * publico
	 */
	private String nombre;
	private int edad;
	private double peso;

	// getter ---> Es un metodo que retorna la variable privada
	public String getNombre() {
		return nombre;
	}

	// setter
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	// eclipse que me resuelva el getter y setter shorcut

	// alt + shift + s ----> r genera los getter y setter

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Constructor de una clase

	public Persona() {
		// super(); // estamos haciendo referencia la super clase Object
	}

	// sobre carga de constructores
	public Persona(String nombre, int edad, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

//	public Persona(int edad, String nombre, double peso) {
//		this.nombre = "Dante";
//		this.edad = 37;
//		this.peso = 104;
//	}

	/*
	 * Teoria de sobrecarga Todo metodo / constructor puede ser sobrecargado pero no
	 * se puede repetir la firma
	 * 
	 * contrato y firma public void saludo(){ } public void saludo(String idioma){ }
	 * public void saludo(int tipoLenguaje){ }
	 */

	public void saludar() {
		System.out.println("hola como estas?");

	}

	                  //"ES"
	public String saludar(String lenguaje) {
		switch (lenguaje.toLowerCase()) {
		case "es":
			return "hola";
		case "en":
			return "hello";
		case "it":
			System.out.println("chao come stai");
			break;

		default:
			System.out.println("no se en q idioma me hablas");
			break;
		}
		return "nada";
	}


	@Override
	public void comunicarse() {
		System.out.println("Soy una persona y me comunico");
		
	}

	@Override
	public String toString() {
		return  "Raza: " + super.getRaza() + " --> Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	

}
