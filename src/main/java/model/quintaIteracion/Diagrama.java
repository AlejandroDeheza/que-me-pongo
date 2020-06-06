package model.quintaIteracion;

public class Diagrama {

}

/*
@startuml
class Guardarropa [[java:model.paraDiagrama.Guardarropa]] {
	-String criterioDeUsuario
	+Guardarropa(String criterioDeUsuario)
	+void agregarPrenda(Prenda prenda)
	+void eliminarPrenda(Prenda prenda)
	+List<Atuendo> todasLasPosiblesCombinaciones()
}
class Prenda [[java:model.Prenda]] {
}
Guardarropa --> "*" Prenda : prendas
interface Propuesta [[java:model.paraDiagrama.Propuesta]] {
	void aplicar()
	void deshacer()
}
class Prenda [[java:model.paraDiagrama.Prenda]] {
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
class PropuestaEliminarPrenda [[java:model.paraDiagrama.PropuestaEliminarPrenda]] {
	+PropuestaEliminarPrenda(Prenda prenda, Guardarropa guardarropa)
	+void aplicar()
	+void deshacer()
}
class Prenda [[java:model.Prenda]] {
}
PropuestaEliminarPrenda --> "1" Prenda : prenda
class Guardarropa [[java:model.quintaIteracion.Guardarropa]] {
}
PropuestaEliminarPrenda --> "1" Guardarropa : guardarropa
interface Propuesta [[java:model.paraDiagrama.Propuesta]] {
}
Propuesta <|.. PropuestaEliminarPrenda
class PropuestaAgregarPrenda [[java:model.paraDiagrama.PropuestaAgregarPrenda]] {
	+PropuestaAgregarPrenda(Prenda prenda, Guardarropa guardarropa)
	+void aplicar()
	+void deshacer()
}
class Prenda [[java:model.Prenda]] {
}
PropuestaAgregarPrenda --> "1" Prenda : prenda
class Guardarropa [[java:model.quintaIteracion.Guardarropa]] {
}
PropuestaAgregarPrenda --> "1" Guardarropa : guardarropa
interface Propuesta [[java:model.paraDiagrama.Propuesta]] {
}
Propuesta <|.. PropuestaAgregarPrenda
class Usuario [[java:model.paraDiagrama.Usuario]] {
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
class Propuesta [[java:model.paraDiagrama.Propuesta]] {
}
Usuario --> "*" Propuesta : propuestas
class Propuesta [[java:model.paraDiagrama.Propuesta]] {
}
Usuario --> "*" Propuesta : propuestasAceptadas
@enduml

*/
