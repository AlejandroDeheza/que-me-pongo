package model;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
	
	private String criterioDeUsuario;
	private List<Prenda> prendas = new ArrayList<Prenda>();
	
	public Guardarropa(String criterioDeUsuario) {
		this.criterioDeUsuario = criterioDeUsuario;
	}
	
	public void agregarPrenda(Prenda prenda) {
		this.prendas.add(prenda);
	}
	
	public void eliminarPrenda(Prenda prenda) {
		this.prendas.remove(prenda);
	}

	public List<Atuendo> todasLasPosiblesCombinaciones() {
		// TODO Auto-generated method stub
		return null;
	}

}
