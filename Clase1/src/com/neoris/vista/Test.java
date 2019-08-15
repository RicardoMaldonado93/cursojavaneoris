package com.neoris.vista;

import com.neoris.modelo.Auto;
import com.neoris.modelo.Avion;
import com.neoris.modelo.Mamifero;
import com.neoris.modelo.Moto;
import com.neoris.modelo.Motor;
import com.neoris.modelo.Persona;
import com.neoris.modelo.fabrica.FabricaVehiculo;

public class Test {

	// esto es el hilo principal
	public static void main(String[] args) {
		// crearnos el objeto de la clase persona
		Persona p = new Persona();
		p.setNombre("Dante");
		p.setEdad(37);
		p.setPeso(107.5);
		
		System.out.println(p); // --> es la posicion de memoria
		
		p.saludar();
		System.out.println(p.saludar("ES")); // ---> hola? 
		
		// primer patron de diseño ---> creacional
		// factoria abstracta 
		Mamifero m1 = new Persona();
		
		// casteo ---> comprobar que un objecto por medio de la herencia u otra forma :P
		// sea del tipo que queremos convertir
		
		// La forma segura :)
		
		if (m1 instanceof Persona) {
			Persona objPersona = (Persona) m1; // casteamos a m1 a un nuevo objeto de tipo persona
			objPersona.setNombre("Albano");
			objPersona.setEdad(31);
		}
		
		m1.setRaza("Caucasico");
		
		System.out.println(m1);
		
		Persona p3 = new Persona();
		Persona p4 = p3;
		
		p4.setNombre("Sergio");
		
		System.out.println(p3.getNombre());

		System.out.println("===========================================");
		// Factoria
		Motor motor1 = new Auto();
		Motor motor2 = new Moto();
		
		
		FabricaVehiculo fv = new FabricaVehiculo();
		System.out.println("=================EJEMPLO 1 ==========================");
		
		fv.fabricoVehiculo(motor1);
		System.out.println("=================EJEMPLO 2==========================");
		fv.fabricoVehiculo(motor2);
		System.out.println("=================EJEMPLO 3==========================");
		
		// por medio de una clase anonima implemento la interfaz Motro 
		// tambien esto es conocido com evento
		fv.fabricoVehiculo(new Motor() {
			
			@Override
			public void encender() {
				System.out.println("Soy una clase anonima");
				System.out.println("Enciendo de milagro buuu buuu");
				
			}
			
			@Override
			public void caballos() {

					System.out.println("Caballo de carrera");
			}

			@Override
			public <T> void combustible(T tobjeto) {
				System.out.println(tobjeto.getClass());
				System.out.println(tobjeto);
				
			}
		});
		
		
		Motor m5 = new Avion();
		m5.combustible(55);

	}

}
