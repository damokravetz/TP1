package ar.edu.ort.taller.ejer5;

public class Aniov2 {

	enum Meses {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}
	
	private int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

	public String getNombreDelMes(int numeroMes) {
		String retorno = "No hay mes " + numeroMes;
		if (numeroMes > 0 && numeroMes < 13) {
			retorno = Meses.values()[numeroMes - 1].name();
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


