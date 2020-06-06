package model.cuartaIteracion;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import model.accuWeatherAPI.AccuWeatherAPI;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {

	private Map<String, RespuestaMeteorologica> ultimasRespuestas;
	private AccuWeatherAPI api;
	private Duration periodoDeValidez;

	public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez) {
		this.api = api;
		this.periodoDeValidez = periodoDeValidez;
		this.ultimasRespuestas = new HashMap<String, RespuestaMeteorologica>();
	}

	public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
		if (!this.ultimasRespuestas.containsKey(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
			ultimasRespuestas.put(direccion, new RespuestaMeteorologica(consultarApi(direccion), proximaExpiracion()));
		}
		return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
	}

	private EstadoDelTiempo consultarApi(String direccion) {
	    Map<String, Object> respuesta = this.api.getWeather(direccion).get(0);
	    Map<String, Object> temperatura = (Map<String, Object>) respuesta.get("Temperature"); 
	    int valorCelcius = pasarACelcius(
	    		(int) temperatura.get("Value")
	    		);
	    //Humedad humedad = (double) respuesta.get(...) > 0.8 ? LLUVIOSO : SECO;
	    return new EstadoDelTiempo(valorCelcius);
	}

	private int pasarACelcius(int fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
	
	private LocalDateTime proximaExpiracion() {
		return LocalDateTime.now().plus(this.periodoDeValidez);
	}

}
