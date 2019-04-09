package ar.edu.ort.taller.ejer4;

import java.util.ArrayList;

public class Test {

	static ArrayList<Integrante> integrantes = new ArrayList<>();
	static Anio anio;

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
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
					+ " dias del a�o" + "\n";
		}
		return retorno;
	}

	/*
	 * En el programa principal mostr� cu�ntos d�as transcurrieron antes del
	 * comienzo del a�o y qu� d�a del a�o es el d�a de cumplea�os de cada
	 * integrante del grupo. Para discutir en clase o a trav�s del Aula Virtual:
	 * Si el m�todo diasTranscurridos(..) es usado una y otra vez, �hay alguna
	 * manera que evitar que el c�lculo de los d�as transcurridos se haga
	 * permanentemente? Si la hay, modific� la clase para mejorar su
	 * performance.
	 */
}
