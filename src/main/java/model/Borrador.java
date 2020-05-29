package model;

import static java.util.Objects.requireNonNull;

import model.uniformes.Sastre;
import model.uniformes.Uniforme;

public class Borrador {
	private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama = Trama.LISA;
	
	private Guardarropa guardarropa = new Guardarropa();
	
	public Borrador(TipoPrenda tipoPrenda) {
		this.tipoPrenda = requireNonNull(tipoPrenda, "tipo prenda es obligatorio");
	}

	public Borrador especificarMaterial(Material material) {
		this.material = requireNonNull(material, "material es obligatorio");
		return this;
	}
	
	public Borrador especificarColorPrimario(Color colorPrimario) {
		this.colorPrimario = requireNonNull(colorPrimario, "color primario es obligatorio");
		return this;
	}
	
	public Borrador especificarColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
		return this;
	}
	
	public Borrador especificarTrama(Trama trama) {
		this.trama = trama == null ? Trama.LISA : trama;
		return this;
	}
	
	public Prenda crearPrenda() {
		if(material == null || colorPrimario == null)
			throw new NullPointerException("Falta algún campo obligatorio");
		
		Prenda nuevaPrenda = new Prenda(tipoPrenda, material, colorPrimario, colorSecundario, trama);
		this.guardarropa.guardarPrenda(nuevaPrenda);
		return nuevaPrenda;
	}
	
	public void crearUniforme(Sastre sastre) {
		this.guardarropa.guardarAtuendo(Uniforme.fabricar(sastre));
	}
	
}
