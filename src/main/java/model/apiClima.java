package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.accuWeatherAPI.AccuWeatherAPI;

public class apiClima implements AccuWeatherAPI{
	
	private static final apiClima INSTANCE = new apiClima();
	
	private apiClima() {
	}

	public static apiClima instance() {
		return INSTANCE;
	}
	
	public int temperaturaActual() {
		List<Map<String, Object>> condicionesClimaticas = this.getWeather("Buenos Aires, Argentina");  
		HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
		int fahrenheit = (int) temperatura.get("Value");
		return (fahrenheit - 32) * 5/9;

	}
	

}
