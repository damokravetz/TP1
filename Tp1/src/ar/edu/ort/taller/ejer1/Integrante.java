package ar.edu.ort.taller.ejer1;

public class Integrante {
	private String nombre;

	public Integrante() {
		this.nombre = "Sin Nombre";
	}

	public Integrante(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Integrante [nombre=" + nombre + "]";
	}

}
