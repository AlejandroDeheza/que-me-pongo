package model;

public class Atuendo {

	private Prenda parteSuperior;
	private Prenda parteInferior;
	private Prenda calzado;
	private Prenda accesorio;
	
	public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio) {
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.calzado = calzado;
		this.accesorio = accesorio;
	} //revisar esto
	
	public boolean aptaParaTemperatura(int temperatura) {
		return parteSuperior.aptaParaTemperatura(temperatura) &&
		parteInferior.aptaParaTemperatura(temperatura) &&
		calzado.aptaParaTemperatura(temperatura) &&
		accesorio.aptaParaTemperatura(temperatura);
	}
	
}
