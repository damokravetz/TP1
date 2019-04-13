package ar.edu.ort.taller.ejer2;

import java.util.ArrayList;

public class Competencia {
	private ArrayList<Atleta> atletas;

	public Competencia() {
		atletas = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}

	public ArrayList<Atleta> getGanadores() {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double tiempo = atletas.get(0).getSegundos();
		for (int i = 0; i < atletas.size(); i++) {
			if (atletas.get(i).getSegundos() <= tiempo) {
				if (atletas.get(i).getSegundos() < tiempo) {
					tiempo = atletas.get(i).getSegundos();
					ganadores.clear();
				}
				ganadores.add(atletas.get(i));
			}
		}
		return ganadores;
	}
}
