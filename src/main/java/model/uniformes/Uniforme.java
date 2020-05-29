package model.uniformes;

import model.Prenda;
import model.Atuendo;

public class Uniforme extends Atuendo {
	private Prenda parteSuperior;
	private Prenda parteInferior;
	private Prenda calzado;

	public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.calzado = calzado;
	}

	public static Uniforme fabricar(Sastre sastre) {
		return new Uniforme(
				sastre.fabricarParteSuperior(),
				sastre.fabricarParteInferior(),
				sastre.fabricarCalzado());
	}
}
