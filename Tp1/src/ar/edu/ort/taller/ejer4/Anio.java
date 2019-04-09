package ar.edu.ort.taller.ejer4;

public class Anio {
	private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre"};
	private int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public String getNombreDelMes(int numeroMes) {
		String retorno = "No hay mes " + numeroMes;
		if(numeroMes > 0 && numeroMes < 13) {
			retorno = meses[numeroMes-1];
		}
		return retorno;
	}
	
	public int getDiasTranscurridos(int numeroMes) {
		int i = 0;
		int contador = 0;
		while (i < numeroMes-1) {
			contador += dias[i];
			i++;
		}
		return contador;
	}
}