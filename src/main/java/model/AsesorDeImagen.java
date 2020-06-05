package model;

import java.util.List;

public class AsesorDeImagen {

	private ServicioMeteorologico servicioMeteorologico;
	
	public AsesorDeImagen(ServicioMeteorologico servicioMeteorologico) {
		this.servicioMeteorologico = servicioMeteorologico;
	}

	public Atuendo sugerirAtuendo(String direccion, Guardarropa guardarropa) {
		    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico
		                                          .obtenerCondicionesClimaticas(direccion);
		    List<Atuendo> combinaciones = guardarropa.todasLasPosiblesCombinaciones();
		  	return combinaciones.stream().filter(
		  			combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.getTemperatura())
		  			).get(0);
		    
		  }

}
