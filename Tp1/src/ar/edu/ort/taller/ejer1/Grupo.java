package ar.edu.ort.taller.ejer1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<Integrante> integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
		integrantes = new ArrayList<Integrante>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	public void agregarIntegrante(Integrante integrante) {
		if (buscarIntegrante(integrante.getNombre()) == null) {
			integrantes.add(integrante);
		}
	}

	private int obtenerPosicionIntegrante(Integrante integrante) {
		boolean a = false;
		int i = 0;
		int res = -1;
		while (a == false && i < integrantes.size()) {
			if (integrantes.get(i).getNombre().equals(integrante.getNombre())) {
				a = true;
				res = i;
			} else {
				i++;
			}
		}
		return res;
	}

	public Integrante obtenerIntegrante(int posicion) {
		Integrante miIntegrante = null;
		if (posicion <= integrantes.size() - 1) {
			miIntegrante = integrantes.get(posicion);
		}
		return miIntegrante;
	}

	public Integrante buscarIntegrante(String nombre) {
		Integrante miIntegrante = null;
		int i = 0;
		while (miIntegrante == null && i < integrantes.size()) {
			if (integrantes.get(i).getNombre().equals(nombre)) {
				miIntegrante = integrantes.get(i);
			} else {
				i++;
			}
		}
		return miIntegrante;
	}

	public Integrante removerIntegrante(String nombreIntegrante) {
		Integrante miIntegrante = buscarIntegrante(nombreIntegrante);
		if (miIntegrante != null) {
			integrantes.remove(miIntegrante);
		}
		return miIntegrante;
	}

	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes: " + integrantes.size());
		System.out.println("Integrantes:");
		for (Integrante integrante : integrantes) {
			System.out.println(integrante.toString());
		}
	}

	public void mostrar() {
		System.out.println("Nombre de grupo: " + this.nombre);
		mostrarIntegrantes();
	}

	public void vaciar() {
		integrantes.clear();
	}

}
