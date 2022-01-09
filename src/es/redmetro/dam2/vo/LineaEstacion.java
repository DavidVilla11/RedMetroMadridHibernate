package es.redmetro.dam2.vo;

import java.io.Serializable;
import java.util.Objects;

public class LineaEstacion implements Serializable{
	
	private static final long serialVersionUID = 1;
	
	private Linea linea;
	private Estacion estacion;
	private int ordenM;
	
	public Linea getLinea() {
		return linea;
	}
	public void setLinea(Linea linea) {
		this.linea = linea;
	}
	public Estacion getEstacion() {
		return estacion;
	}
	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
	public int getOrdenM() {
		return ordenM;
	}
	public void setOrdenM(int ordenM) {
		this.ordenM = ordenM;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(estacion, linea);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaEstacion other = (LineaEstacion) obj;
		return Objects.equals(estacion, other.estacion) && Objects.equals(linea, other.linea);
	}

	
	
	
	
}
