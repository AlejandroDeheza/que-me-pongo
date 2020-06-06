package model.prenda;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama;
	
	private int temperaturaMaxima; // hay que ingresar esto a la clase de alguna forma
	//en el builder quizas

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
    }

    public Categoria getCategoria() {
        return this.tipoPrenda.getCategoria();
    }

	public boolean aptaParaTemperatura(int temperatura) {
		return temperaturaMaxima >= temperatura;
	}
}
