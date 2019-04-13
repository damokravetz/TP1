package ar.edu.ort.taller.ejer4;

public class Integrante {
	private String nombre;
	private int diaCumple;
	private int mesCumple;

	public Integrante(String nombre, int diaCumple, int mesCumple) {
		this.nombre = nombre;
		this.diaCumple = diaCumple;
		this.mesCumple = mesCumple;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiaCumple() {
		return diaCumple;
	}

	public void setDiaCumple(int diaCumple) {
		this.diaCumple = diaCumple;
	}

	public int getMesCumple() {
		return mesCumple;
	}

	public void setMesCumple(int mesCumple) {
		this.mesCumple = mesCumple;
	}
}
