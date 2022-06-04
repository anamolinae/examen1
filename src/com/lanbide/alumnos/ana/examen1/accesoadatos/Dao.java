package com.lanbide.alumnos.ana.examen1.accesoadatos;

public interface Dao<T> {
	Iterable<T> obtenerTodos();
	T obtenerPorId(LongId);
	
	void insertar(T objeto);
	void modificar(T fobjeto);
	void borrar(Long id);
	

}
