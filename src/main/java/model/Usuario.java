package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Borrador borradorActual;
	private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
	private List<Propuesta> propuestas = new ArrayList<Propuesta>();
	
	public void compartirGuardarropa(Guardarropa guardarropa){ //para recibir un guardarropa que me estan compartiendo
		this.guardarropas.add(guardarropa);
	}
	
	private Guardarropa elegirGuardarropa(int indice) { // es para que el mismo usuario pueda elegir que guardarropa compartir..
		return this.guardarropas.get(indice);
	}
	
	
	//para el ultimo requerimiento quiza podria utilizar el patron Memento..

}
