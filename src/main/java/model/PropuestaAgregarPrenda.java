package model;

public class PropuestaAgregarPrenda implements Propuesta{
	
	private Prenda prenda;
	
	public PropuestaAgregarPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	
	public void aplicarEn(Guardarropa guardarropa) {
		guardarropa.agregarPrenda(prenda);
	}
	
	public void deshacer(Guardarropa guardarropa) {
		guardarropa.eliminarPrenda(prenda);
	}

}
