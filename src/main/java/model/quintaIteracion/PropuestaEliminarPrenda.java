package model.quintaIteracion;
import model.prenda.Prenda;

public class PropuestaEliminarPrenda implements Propuesta{
	
	private Prenda prenda;
	private Guardarropa guardarropa;
	
	public PropuestaEliminarPrenda(Prenda prenda, Guardarropa guardarropa) {
		this.prenda = prenda;
		this.guardarropa = guardarropa;
	}
	
	public void aplicar() {
		this.guardarropa.eliminarPrenda(prenda);
	}
	
	public void deshacer() {
		this.guardarropa.agregarPrenda(prenda);
	}

}
