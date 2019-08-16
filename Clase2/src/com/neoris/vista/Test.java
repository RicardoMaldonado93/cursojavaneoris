package com.neoris.vista;

import java.util.ArrayList;

import com.neoris.controlador.FabricaControlador;
import com.neoris.modelo.Auto;
import com.neoris.modelo.Rueda;
import com.neoris.modelo.TipoRueda;
import com.neoris.modelo.clase.abstracta.Vehiculo;
import com.neoris.modelo.implementacion.FabricaImp;

public class Test {

	public static void main(String[] args) {
		FabricaControlador fc = new FabricaControlador(new FabricaImp(new ArrayList<Vehiculo>()));
		
		fc.crearVehiculo(new Auto("Negro", "Audi", "GT", new Rueda("Pirelli", 17, TipoRueda.PINCHADO)));
		
		// 
		fc.getLista().forEach(item ->{
			System.out.println(item);
		});
		
	}

}
