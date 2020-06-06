package model.cuartaIteracion;

import java.util.ArrayList;
import java.util.List;

import model.cuartaIteracion.Atuendo;
import model.quintaIteracion.Guardarropa;

public class AsesorDeImagen {

	private ServicioMeteorologico servicioMeteorologico;
	
	public AsesorDeImagen(ServicioMeteorologico servicioMeteorologico) {
		this.servicioMeteorologico = servicioMeteorologico;
	}

	public Atuendo sugerirAtuendo(String direccion, Guardarropa guardarropa) {
		    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico
		                                          .obtenerCondicionesClimaticas(direccion);
		    return combinacionesAptas(estadoDelTiempo, guardarropa).get(0);
		  }
	
	private ArrayList<Atuendo> combinacionesAptas(
			EstadoDelTiempo estadoDelTiempo, Guardarropa guardarropa){
		
		return (ArrayList<Atuendo>) guardarropa.todasLasPosiblesCombinaciones().stream()
				.filter(combinacion -> combinacion.aptaParaTemperatura(
						estadoDelTiempo.getTemperatura()));
	}

}
