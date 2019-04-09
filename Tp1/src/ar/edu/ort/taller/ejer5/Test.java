package ar.edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Test {

	static ArrayList<Integrante> integrantes = new ArrayList<>();
	static Aniov2 anio;
	
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		anio = new Aniov2();
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

}
