package com.neoris.controlador;

import java.util.Scanner;

import com.neoris.modelo.Auto;
import com.neoris.modelo.Motor;
import com.neoris.modelo.fabrica.FabricaChasis;

/*
 * Importanciones magicas con eclipse
 * ctrl + shift + O
 */
public class FabricaVehiculoControlador implements FabricaChasis<Motor>{

	@Override
	public Motor fabricoChasis() {
		Motor m1 = new Auto();
		System.out.println("ingrese el tipo de vehiculo qquiere retornar");
		Scanner input = new Scanner(System.in);
		String sarasa = input.nextLine();
		System.out.println(sarasa); // aplicar la logica necesaria para devolver un auto o moto
		return m1; // retorno un auto 
	}

	@Override
	public void moldeoChasis(Motor tobjeto) {

		System.out.println(tobjeto.getClass().getSimpleName());
		
	}

}
