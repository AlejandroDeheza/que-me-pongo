package model.quintaIteracion;

import model.prenda.Prenda;

public class PropuestaAgregarPrenda implements Propuesta{
	
	private Prenda prenda;
	private Guardarropa guardarropa;
	
	public PropuestaAgregarPrenda(Prenda prenda, Guardarropa guardarropa) {
		this.prenda = prenda;
		this.guardarropa = guardarropa;
	}
	
	public void aplicar() {
		this.guardarropa.agregarPrenda(prenda);
	}
	
	public void deshacer() {
		this.guardarropa.eliminarPrenda(prenda);
	}

}
