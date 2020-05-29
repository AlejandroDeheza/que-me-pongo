package model;

import java.util.List;

public interface SugerenciasDeAtuendo {

	 public default List<Atuendo> generarSugerencias(){
		return null; //primer opcion, el Guardarropa recibe este mensaje y 
	 }				 //responde con las sugerencias
	 
	 public default void brindarSugerencias(List<Atuendo> atuendos){
	 }// segunda opcion, para interfaz saliente.. en esta el Guardarropa envia las sugerencias
}
