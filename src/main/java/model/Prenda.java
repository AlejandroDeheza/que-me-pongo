package model;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
    }
    
    public TipoPrenda getTipoPrenda() {
    	return this.tipoPrenda;
    }

    public Categoria getCategoria() {
        return this.tipoPrenda.getCategoria();
    }
}
