package model;

import java.util.List;

public interface GeneradorSugerencias {
	
	public default List<Atuendo> generarSugerenciasDesde(List<Prenda> prendasAptas){
		return null;
	}

}
