package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Borrador borradorActual;
	private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
	private List<Propuesta> propuestas = new ArrayList<Propuesta>();
	private List<Propuesta> propuestasAceptadas = new ArrayList<Propuesta>();
	
	public void compartirGuardarropa(Guardarropa guardarropa){ 
		this.guardarropas.add(guardarropa);
	}//para recibir un guardarropa que me estan compartiendo
	
	public void aceptarTodasLasPropuestas() {
		this.propuestas.stream().forEach(propuesta -> propuesta.aplicar());
		this.propuestasAceptadas = propuestas;
		this.propuestas.clear();
	}
	
	public void rechazarTodasLasPropuestas() {
		this.propuestas.clear();
	}
	
	public void deshacerPropuestasAceptadas() {
		this.propuestasAceptadas.stream().forEach(propuesta -> propuesta.deshacer());
		this.propuestasAceptadas.clear();
	}
	
	public void aceptarUnaPropuesta(Propuesta propuesta) {
		propuesta.aplicar();
	}//capaz no es necesario
	
	public void rechazarUnaPropuesta(Propuesta propuesta) {
		propuesta.deshacer();
	}//capaz no es necesario
	
	

}
