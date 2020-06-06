package model.quintaIteracion;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
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
	
	public void deshacerTodasLasPropuestasAceptadas() {
		this.propuestasAceptadas.stream().forEach(propuesta -> propuesta.deshacer());
		this.propuestasAceptadas.clear();
	}
	
	public void deshacerUnaPropuesta(Propuesta propuesta) {
		propuesta.deshacer();
		this.propuestasAceptadas.remove(propuesta);
	}
	
	public void aceptarUnaPropuesta(Propuesta propuesta) {
		propuesta.aplicar();
		this.propuestasAceptadas.add(propuesta);
		this.propuestas.remove(propuesta);
	}
	
	public void rechazarUnaPropuesta(Propuesta propuesta) {
		this.propuestas.remove(propuesta);
	}

}
