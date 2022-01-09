package es.redmetro.dam2.vo;


import java.util.HashSet;
import java.util.Set;


public class Estacion {
	private int codigoEstacion;
	private String nombre;
	private String direccion;
	private Set<Linea> lineaEstacion = new HashSet<Linea>();

	
	public int getCodigoEstacion() {
		return codigoEstacion;
	}
	public void setCodigoEstacion(int codigoEstacion) {
		this.codigoEstacion = codigoEstacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Set<Linea> getLineaEstacion() {
		return lineaEstacion;
	}
	public void setLineaEstacion(Set<Linea> lineaEstacion) {
		this.lineaEstacion = lineaEstacion;
	}



}
