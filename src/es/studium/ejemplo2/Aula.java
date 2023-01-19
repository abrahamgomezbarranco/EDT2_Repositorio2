package es.studium.ejemplo2;

public class Aula {
	private String nombre;
	private int numeroalumnos;
	
	public Aula() {
		nombre = "";
		numeroalumnos = 0;
	}

	public Aula(String nombre, int numeroalumnos) {
		this.nombre = nombre;
		this.numeroalumnos = numeroalumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroalumnos() {
		return numeroalumnos;
	}

	public void setNumeroalumnos(int numeroalumnos) {
		this.numeroalumnos = numeroalumnos;
	}
	
}
