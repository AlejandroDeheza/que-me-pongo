package model.quintaIteracion;

import java.util.ArrayList;

import java.util.List;

import model.cuartaIteracion.Atuendo;
import model.prenda.Prenda;

public class Guardarropa {
	
	private List<Prenda> prendas = new ArrayList<Prenda>();
	
	public Guardarropa() {
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
