package com.lanbide.alumnos.ana.examen1.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Libros {
	private Long id;
	private String titulo;
	private String autor;
	private LocalDate fechaPublicacion;
	private Long isbn;
	private double precio;
	private boolean fisico;
	
	//3constructor mayor 
	public Libros(Long id, String titulo, String autor, LocalDate fechaPublicacion, Long isbn, double precio,
			boolean fisico) {
		//4. cambiar setters
		setId(id);
		setTitulo(titulo);
		setAutor(autor);
		setFechaPublicacion(fechaPublicacion);
		setIsbn(isbn);
		setPrecio(precio);
		setFisico(fisico);	
	}
	
	//5. constructor
	public Libros() {
		
	}
	
	//2 setters y getters. el get no, ajustas el seter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		if (id != null && id < 0) {
			throw new RuntimeException("el id debe de ser mayor o igual a cero");         //8.hacer una clase que se llame asi pero al escribir que extend exeption  te da y ayudapa ponerle id a ese
		}
			
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) { //11. sigue aqui 
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isFisico() {
		return fisico;
	}
	public void setFisico(boolean fisico) {
		this.fisico = fisico;
	}

	
	//6. hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(autor, fechaPublicacion, fisico, id, isbn, precio, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(fechaPublicacion, other.fechaPublicacion)
				&& fisico == other.fisico && Objects.equals(id, other.id) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(titulo, other.titulo);
	}

	//7. tostring
	@Override
	public String toString() {
		return "Libros [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion
				+ ", isbn=" + isbn + ", precio=" + precio + ", fisico=" + fisico + "]";
	}
	
	
	
	
	
	



}
