package model.prenda;

public class Diagrama {

}

/*
@startuml
class Borrador [[java:model.prenda.Borrador]] {
	+Borrador(TipoPrenda tipoPrenda)
	+Borrador especificarMaterial(Material material)
	+Borrador especificarColorPrimario(Color colorPrimario)
	+Borrador especificarColorSecundario(Color colorSecundario)
	+Borrador especificarTrama(Trama trama)
	+Prenda crearPrenda()
}
class TipoPrenda [[java:model.prenda.TipoPrenda]] {
}
Borrador ..> "1" Prenda : prenda

enum Categoria [[java:model.prenda.Categoria]] {
	PARTE_SUPERIOR
	PARTE_INFERIOR
	CALZADO
	ACCESORIO
}
class Color [[java:model.prenda.Color]] {
	-int rojo
	-int verde
	-int azul
	+Color(int rojo, int verde, int azul)
}
enum Material [[java:model.prenda.Material]] {
	ALGODON
	JEAN
	LINO
	SEDA
	PIQUE
	ACETATO
	CUERINA
	CUERO
}
class Prenda [[java:model.prenda.Prenda]] {
	-int temperaturaMaxima
	+Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama)
	+Categoria getCategoria()
	+boolean aptaParaTemperatura(int temperatura)
}
class TipoPrenda [[java:model.prenda.TipoPrenda]] {
}
Prenda --> "1" TipoPrenda : tipoPrenda
class Material [[java:model.prenda.Material]] {
}
Prenda --> "1" Material : material
class Color [[java:model.prenda.Color]] {
}
Prenda --> "1" Color : colorPrimario
class Color [[java:model.prenda.Color]] {
}
Prenda --> "1" Color : colorSecundario
class Trama [[java:model.prenda.Trama]] {
}
Prenda --> "1" Trama : trama
enum TipoPrenda [[java:model.prenda.TipoPrenda]] {
	ZAPATO
	ZAPATILLA
	CAMISA
	CHOMBA
	REMERA
	BLUSA
	POLLERA
	PANTALON
	SOMBRERO
	ANTEOJOS
	~TipoPrenda(Categoria categoria)
	+Categoria getCategoria()
}
class Categoria [[java:model.prenda.Categoria]] {
}
TipoPrenda --> "1" Categoria : categoria
enum Trama [[java:model.prenda.Trama]] {
	LISA
	RAYADA
	LUNARES
	CUADROS
	ESTAMPADA
}
@enduml

*/