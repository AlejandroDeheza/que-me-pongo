package model.quintaIteracion;

public class Diagrama {

}

/*
@startuml
class Usuario [[java:model.quintaIteracion.Usuario]] {
	+void compartirGuardarropa(Guardarropa guardarropa)
	+void aceptarTodasLasPropuestas()
	+void rechazarTodasLasPropuestas()
	+void deshacerTodasLasPropuestasAceptadas()
	+void deshacerUnaPropuesta(Propuesta propuesta)
	+void aceptarUnaPropuesta(Propuesta propuesta)
	+void rechazarUnaPropuesta(Propuesta propuesta)
}
class Guardarropa [[java:model.quintaIteracion.Guardarropa]] {
}
Usuario --> "*" Guardarropa : guardarropas
class Propuesta [[java:model.quintaIteracion.Propuesta]] {
}
Usuario --> "*" Propuesta : propuestas
class Propuesta [[java:model.quintaIteracion.Propuesta]] {
}
Usuario --> "*" Propuesta : propuestasAceptadas
class PropuestaAgregarPrenda [[java:model.quintaIteracion.PropuestaAgregarPrenda]] {
	+PropuestaAgregarPrenda(Prenda prenda, Guardarropa guardarropa)
	+void aplicar()
	+void deshacer()
}
class Prenda [[java:model.prenda.Prenda]] {
}
PropuestaAgregarPrenda --> "1" Prenda : prenda
class Guardarropa [[java:model.quintaIteracion.Guardarropa]] {
}
PropuestaAgregarPrenda --> "1" Guardarropa : guardarropa
interface Propuesta [[java:model.quintaIteracion.Propuesta]] {
}
Propuesta <|.. PropuestaAgregarPrenda
interface Propuesta [[java:model.quintaIteracion.Propuesta]] {
	void aplicar()
	void deshacer()
}
class PropuestaEliminarPrenda [[java:model.quintaIteracion.PropuestaEliminarPrenda]] {
	+PropuestaEliminarPrenda(Prenda prenda, Guardarropa guardarropa)
	+void aplicar()
	+void deshacer()
}
class Prenda [[java:model.prenda.Prenda]] {
}
PropuestaEliminarPrenda --> "1" Prenda : prenda
class Guardarropa [[java:model.quintaIteracion.Guardarropa]] {
}
PropuestaEliminarPrenda --> "1" Guardarropa : guardarropa
interface Propuesta [[java:model.quintaIteracion.Propuesta]] {
}
Propuesta <|.. PropuestaEliminarPrenda
class Guardarropa [[java:model.quintaIteracion.Guardarropa]] {
	+Guardarropa()
	+void agregarPrenda(Prenda prenda)
	+void eliminarPrenda(Prenda prenda)
	+List<Atuendo> todasLasPosiblesCombinaciones()
}
class Prenda [[java:model.prenda.Prenda]] {
}
Guardarropa --> "*" Prenda : prendas
class Prenda [[java:model.quintaIteracion.Prenda]] {
	-TipoPrenda tipoPrenda
	-Material material
	-Color colorPrimario
	-Color colorSecundario
	-Trama trama
	-int temperaturaMaxima
	+Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama)
	+Categoria getCategoria()
	+boolean aptaParaTemperatura(int temperatura)
}
@enduml

*/
