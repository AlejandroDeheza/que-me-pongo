package model;

public enum TipoPrenda {
    ZAPATO(Categoria.CALZADO, 30),

    ZAPATILLA(Categoria.CALZADO, 30),

    CAMISA(Categoria.PARTE_SUPERIOR, 30),

    CHOMBA(Categoria.PARTE_SUPERIOR, 30),

	REMERA(Categoria.PARTE_SUPERIOR, 40),

    BLUSA(Categoria.PARTE_SUPERIOR, 40),

    POLLERA(Categoria.PARTE_INFERIOR, 40),

    PANTALON(Categoria.PARTE_INFERIOR, 20),

    SOMBRERO(Categoria.ACCESORIO, 40),

    ANTEOJOS(Categoria.ACCESORIO, 40), 
	
	REMERA_MANGA_LARGA(Categoria.PARTE_SUPERIOR , 20);
    
    private Categoria categoria;
    private int temperaturaMaximaDeUso;

    TipoPrenda(Categoria categoria, int temperaturaMaximaDeUso) {
        this.categoria = categoria;
        this.temperaturaMaximaDeUso = temperaturaMaximaDeUso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

	public int getTemperaturaMaximaDeUso() {
		return temperaturaMaximaDeUso;
	}
}
