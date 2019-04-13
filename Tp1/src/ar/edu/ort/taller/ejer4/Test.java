package ar.edu.ort.taller.ejer4;

import java.util.ArrayList;

public class Test {

	static ArrayList<Integrante> integrantes = new ArrayList<>();
	static Anio anio;

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		anio = new Anio();
		Integrante integrante1 = new Integrante("Leandro", 16, 3);
		Integrante integrante2 = new Integrante("Damian", 29, 5);
		integrantes.add(integrante1);
		integrantes.add(integrante2);
		System.out.println(getDiasAnio());
	}

	private static String getDiasAnio() {
		String retorno = "";
		for (Integrante integrante : integrantes) {
			retorno += "El integrante: " + integrante.getNombre() + " " + "cumple el dia " + integrante.getDiaCumple()
					+ " " + "de " + anio.getNombreDelMes(integrante.getMesCumple()) + " y transcurrieron "
					+ (anio.getDiasTranscurridos(integrante.getMesCumple()) + integrante.getDiaCumple())
					+ " dias del año" + "\n";
		}
		return retorno;
	}

}
