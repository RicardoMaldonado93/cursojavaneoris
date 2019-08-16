package com.neoris.controlador;

import java.util.List;

import com.neoris.modelo.clase.abstracta.Vehiculo;
import com.neoris.modelo.implementacion.FabricaImp;

public class FabricaControlador {

	// IoC 
	
	private FabricaImp fabrica;
	
	public FabricaControlador(FabricaImp fabrica) {
		this.fabrica=fabrica;
	}
	
	
	public void crearVehiculo(Vehiculo v) {
		this.fabrica.crear(v);
	}
	
	public List<Vehiculo> getLista(){
		return this.fabrica.devuelvoLista();
	}
}
