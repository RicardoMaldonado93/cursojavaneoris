package com.neoris.modelo.implementacion;

import java.util.List;

import com.neoris.modelo.clase.abstracta.Vehiculo;
import com.neoris.modelo.interfaces.Fabrica;

public class FabricaImp implements Fabrica<Vehiculo> {

	// Listas
	private List<Vehiculo> listaVehiculo;

	public FabricaImp(List<Vehiculo> lista) {
		this.listaVehiculo = lista;
	}

	@Override // new Moto("honda","rojo","Goldwing", new Rueda(""));
	public void crear(Vehiculo vehiculo) {
		System.out.println("VEHICULO AGREGADO A LA LISTA!");
		this.listaVehiculo.add(vehiculo);

	}

	@Override
	public void modificar(Vehiculo vehiculo, int id) {
		// TODO Auto-generated method stub
		if (this.listaVehiculo.size() > id) {
			Vehiculo v = this.listaVehiculo.get(id);
			v = vehiculo; // se resuelve aca

			// lo dejamos para q vean como remover y volver a ocupar la posicion
			// removemos y volvemos a poner
			this.listaVehiculo.remove(id);
			this.listaVehiculo.add(id, v);

		}

	}

	@Override
	public void borrar(Vehiculo vehiculo) {
		this.listaVehiculo.remove(vehiculo);

	}

	@Override
	public void borrar(int id) {
		this.listaVehiculo.remove(id);
	}

	@Override
	public List<Vehiculo> devuelvoLista() {
		return this.listaVehiculo;
	}

//	// String 
//	public <T extends Vehiculo> void magicaMagica(T vehiculo) {
//		
//	}
//	
//	// String
//	public void magiaMagica(Object vehiculo) {
//		
//	}
}
