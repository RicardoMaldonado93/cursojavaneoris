package com.neoris.controlador;

import com.neoris.modelo.Moto;
import com.neoris.modelo.fabrica.FabricaChasis;

public class FabriaMotoControlador implements FabricaChasis<Moto>{

	@Override
	public Moto fabricoChasis() {
		Moto m1 = new Moto();
		m1.encender();
		return m1;
	}

	@Override
	public void moldeoChasis(Moto moto) {
		moto.caballos();
	}

}
