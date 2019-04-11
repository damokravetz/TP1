package ar.edu.ort.taller.ejer6;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		GastoAnual test=new GastoAnual();
		String[]a= {"a","b","c","d"};
		Random r;
		for(int i=0;i<a.length;i++) {
			for(int o=0;o<Mes.values().length;o++) {
				r = new Random();
				double randomValue = 1000 + (2000 - 1000) * r.nextDouble();
				test.agregarGasto(Mes.values()[o], a[i], randomValue);
			}
		}
		test.informarConsumosPorMes();
		System.out.println(test.gastoAcumulado("a"));
		test.gastoAcumulado(Mes.ABRIL);
		test.informarMesMayorConsumo();
		test.informarPromedioMensualPorRubro();

	}

}
