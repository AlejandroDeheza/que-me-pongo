package model;

import java.time.LocalDateTime;

public class RespuestaMeteorologica {
	
	private EstadoDelTiempo estadoDelTiempo;
	private LocalDateTime expiracion;

	public RespuestaMeteorologica(EstadoDelTiempo estadoDelTiempo, LocalDateTime expiracion) {
		this.estadoDelTiempo = estadoDelTiempo;
		this.expiracion = expiracion;
	}
	
	public EstadoDelTiempo getEstadoDelTiempo() {
		return estadoDelTiempo;
	}

	public boolean expiro() {
		return this.expiracion.isAfter(LocalDateTime.now());
	}

	

}
