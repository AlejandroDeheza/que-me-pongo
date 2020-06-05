package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Borrador borradorActual;
	private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
	private List<Propuesta> propuestas = new ArrayList<Propuesta>();
	
	public void compartirGuardarropa(Guardarropa guardarropa){
		this.guardarropas.add(guardarropa);
	}
	
	private Guardarropa elegirGuardarropa(int indice) { // es para que el mismo usuario pueda elegir que guardarropa compartir..
		return this.guardarropas.get(indice);
	}
	
	public void propuestaAgregarPrenda(Prenda prenda){
		this.propuestaAgregarPrenda.add(prenda);
	}
	
	public void propuestaEliminarPrenda(Prenda prenda){
		this.propuestaEliminarPrenda.add(prenda);
	}
	
	//para el ultimo requerimiento quiza podria utilizar el patron Memento..

}
