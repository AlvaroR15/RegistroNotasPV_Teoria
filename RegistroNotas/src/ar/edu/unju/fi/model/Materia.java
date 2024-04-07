package ar.edu.unju.fi.model;

public class Materia {
	private String codigo;
	private String nombre;
	
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	
	public Materia(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	

	@Override
	public String toString() {
		return " Codigo de Materia: " + codigo + "\n   Nombre de Materia: " + nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
