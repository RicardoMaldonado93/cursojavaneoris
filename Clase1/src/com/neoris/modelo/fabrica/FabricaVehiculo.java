package com.neoris.modelo.fabrica;

import com.neoris.modelo.Motor;

public class FabricaVehiculo {

	
	// 
	public void fabricoVehiculo(Motor motor) {
		
		System.out.println("Fabrico un vehiculo para " + motor.getClass().getSimpleName());
		motor.encender();
		motor.caballos();
		motor.combustible("Hola soy un combustible galactico");
	}
}
