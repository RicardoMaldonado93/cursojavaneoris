package com.neoris.modelo.interfaces;

import java.util.List;

import com.neoris.modelo.clase.abstracta.Vehiculo;

public interface Fabrica<T extends Vehiculo> {

	public void crear(T vehiculo);
	
//	// opcion A
//	public T modificar(String marca, String modelo, String color, Rueda rueda);
//	
//	// opcion B
//	public void modificar(T vehiculo);
//	
	//opcion C
	public void modificar(T vehiculo, int id);
	
	public void borrar(T vehiculo);
	
	public void borrar(int id);
	
	public List<T> devuelvoLista();


	
}
