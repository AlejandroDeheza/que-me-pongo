package model;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa implements GeneradorSugerencias, SugerenciasDeAtuendo{
	
	private List<Prenda> prendas = new ArrayList<>();
	private List<Atuendo> atuendos = new ArrayList<>();
	
	public Guardarropa(){
	}
	
	public void guardarPrenda(Prenda prenda) {
		this.prendas.add(prenda);
	}
	
	public void guardarAtuendo(Atuendo atuendo) {
		this.atuendos.add(atuendo);
	}
	
	public List<Prenda> obtenerPrendasAptasSegunClima() {
		int temperaturaActual = apiClima.instance().temperaturaActual();
		List<Prenda> prendasAptas = 
				(List<Prenda>) this.prendas.stream()
				.filter(
				prenda -> 
				prenda.getTipoPrenda().getTemperaturaMaximaDeUso() > temperaturaActual);
		return prendasAptas;
	}
	
	public List<Atuendo> generarSugerencias(){
		List<Prenda> prendasAptas = this.obtenerPrendasAptasSegunClima();
		return this.generarSugerenciasDesde(prendasAptas);
	}

}
