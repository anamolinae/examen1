package com.lanbide.alumnos.ana.examen1.entidades;

import java.time.Year;
import java.util.Objects;


public class Libro {
	private Long id;
	private String titulo;
	private String autor;
	private Year fechaPublicacion;
	private Double precio;
	private Boolean fisico;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		if (id != null && id < 0) {
			throw new EntidadesException("El id debe ser mayor o igual que 0");
		}

		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo == null || titulo.trim().length() < 2) {
			throw new EntidadesException("debes de insertar titulo mayor a dos caracteres");
		}
		
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Year getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Year fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean getFisico() {
		return fisico;
	}
	public void setFisico(Boolean fisico) {
		this.fisico = fisico;
	}
	
	public Libro(Long id, String titulo, String autor, Year fechaPublicacion, Double precio, Boolean fisico) {
		setId(id);
		setTitulo(titulo);
		setAutor(autor);
		setFechaPublicacion(fechaPublicacion);
		setPrecio(precio);
		setFisico(fisico);
	}
	public Libro() {
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, fechaPublicacion, fisico, id, precio, titulo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(fechaPublicacion, other.fechaPublicacion)
				&& Objects.equals(fisico, other.fisico) && Objects.equals(id, other.id)
				&& Objects.equals(precio, other.precio) && Objects.equals(titulo, other.titulo);
	}
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion
				+ ", precio=" + precio + ", fisico=" + fisico + "]";
	}
		
}