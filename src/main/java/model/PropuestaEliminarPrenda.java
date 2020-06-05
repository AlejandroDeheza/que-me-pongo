package model;

public class PropuestaEliminarPrenda implements Propuesta{
	
	private Prenda prenda;
	
	public PropuestaEliminarPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	
	public void aplicarEn(Guardarropa guardarropa) {
		guardarropa.eliminarPrenda(prenda);
	}
	
	public void deshacer(Guardarropa guardarropa) {
		guardarropa.agregarPrenda(prenda);
	}

}
