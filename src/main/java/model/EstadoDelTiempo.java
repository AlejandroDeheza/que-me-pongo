package model;

public class EstadoDelTiempo {
	
	private int temperatura;
	//aca se podrian agrupar mas datos del estado del tiempo
	//como la humedad
	
	public EstadoDelTiempo(int temperatura) {
		this.temperatura = temperatura;
	};
	
	public int getTemperatura() {
		return this.temperatura;
	}

}
