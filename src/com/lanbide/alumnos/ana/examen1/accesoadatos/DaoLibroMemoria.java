package com.lanbide.alumnos.ana.examen1.accesoadatos;

public class DaoLibroMemoria implements DaoLibro {
	// al escribir eso y hacer el error de daolibrosmemoria se hace 
	//automaticamente el overide de hasta abajo  
	//es necesario borrar las tareas pendientes de estos overides
	// despues nos vamos a seguir con el singleton
	// POR ULTIMO HACEMOS UN TREEMAP
	
	private static final TreeMap<Long, Libro> empleados = new TreeMap<>();
	
	
	//SINGLETON
	public DaoLibroMemoria() {
	}
	private static final DaoLibroMemoria INSTANCIA = new DaoLibroMemoria();
	
	public static DaoLibroMemoria getInstancia() {
		return INSTANCIA;
	}
		//FIN DE EL SINGLETON
	


	@Override
	public Iterable<DaoLibro> obtenerTodos() {
		return null;
	}

	@Override
	public DaoLibro obtenerPorId() {
		return null;
	}

	@Override
	public void insertar(DaoLibro objeto) {
		
	}

	@Override
	public void modificar(DaoLibro fobjeto) {
		
	}

	@Override
	public void borrar(Long id) {
		
	}

}
