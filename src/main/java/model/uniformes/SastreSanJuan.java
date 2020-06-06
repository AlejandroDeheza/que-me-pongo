package model.uniformes;

import model.prenda.Borrador;
import model.prenda.Color;
import model.prenda.Material;
import model.prenda.Prenda;
import model.prenda.TipoPrenda;

public class SastreSanJuan implements Sastre {
	@Override
	public Prenda fabricarParteSuperior() {		
		return new Borrador(TipoPrenda.CHOMBA)
				.especificarMaterial(Material.PIQUE)
				.especificarColorPrimario(new Color(0, 143, 57))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
		return new Borrador(TipoPrenda.PANTALON)
				.especificarMaterial(Material.ACETATO)
				.especificarColorPrimario(new Color(130, 130, 130))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		return new Borrador(TipoPrenda.ZAPATILLA)
				.especificarMaterial(Material.CUERINA)
				.especificarColorPrimario(new Color(255, 255, 255))
				.crearPrenda();
	}
}
