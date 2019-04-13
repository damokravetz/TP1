package ar.edu.ort.taller.ejer6;

import java.util.ArrayList;

public class GastoAnual {
	private ArrayList<Rubro> rubros;

	public GastoAnual() {
		rubros = new ArrayList<Rubro>();
	}

	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		if (importe > 0) {
			obtenerRubro(nombreRubro).agregarGasto(mes, importe);
		}
	}

	private Rubro obtenerRubro(String nombreRubro) {
		Rubro miRubro = null;
		int i = 0;
		while (i < rubros.size() && miRubro == null) {
			if (rubros.get(i).getNombre().equals(nombreRubro)) {
				miRubro = rubros.get(i);
			} else {
				i++;
			}
		}
		if (miRubro == null) {
			miRubro = new Rubro(nombreRubro);
			rubros.add(miRubro);
		}
		return miRubro;
	}

	private Rubro buscarRubro(String nombreRubro) {
		Rubro miRubro = null;
		int i = 0;
		while (i < rubros.size() && miRubro == null) {
			if (rubros.get(i).getNombre().equals(nombreRubro)) {
				miRubro = rubros.get(i);
			} else {
				i++;
			}
		}
		return miRubro;
	}

	private double[][] consolidadoDeGastos() {
		double[][] res = new double[rubros.size()][Mes.values().length];
		for (int i = 0; i < rubros.size(); i++) {
			for (int o = 0; o < res[i].length; o++) {
				res[i][o] = rubros.get(i).getTotalGastos(Mes.values()[o]);
			}
		}
		return res;
	}

	public double gastoAcumulado(Mes mes) {
		double res = 0;
		for (int i = 0; i < rubros.size(); i++) {
			res += rubros.get(i).getTotalGastos(mes);
		}
		return res;
	}

	public double gastoAcumulado(String nombreRubro) {
		Rubro miRubro = null;
		double res = 0;
		miRubro = buscarRubro(nombreRubro);
		if (miRubro != null) {
			for (int i = 0; i < Mes.values().length; i++) {
				res += miRubro.getTotalGastos(Mes.values()[i]);
			}
		} else {
			res = -1;
		}
		return res;
	}

	public void informarConsumosPorMes() {
		for (int i = 0; i < rubros.size(); i++) {
			System.out.println("Rubro: " + rubros.get(i).getNombre());
			for (int o = 0; o < Mes.values().length; o++) {
				System.out.println("Mes: " + Mes.values()[o]);
				System.out.println("Consumo: " + rubros.get(i).getTotalGastos(Mes.values()[o]));
			}
		}
	}

	public void informarPromedioMensualPorRubro() {
		double res;
		for (int i = 0; i < rubros.size(); i++) {
			res = 0;
			System.out.println("Rubro: " + rubros.get(i).getNombre());
			for (int o = 0; o < Mes.values().length; o++) {
				res += rubros.get(i).getTotalGastos(Mes.values()[o]);
			}
			res = res / Mes.values().length;
			System.out.println("Promedio mensual: " + res);
		}
	}

	public void informarMesMayorConsumo() {
		double mayor = 0;
		ArrayList<Integer> b = new ArrayList<Integer>();
		double[] res = new double[Mes.values().length];
		double[][] a = consolidadoDeGastos();
		for (int i = 0; i < a.length; i++) {
			for (int o = 0; o < a[i].length; o++) {
				res[o] += a[i][o];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (res[i] >= mayor) {
				if (res[i] > mayor) {
					b.clear();
					mayor = res[i];
				}
				b.add(i);
			}
		}
		System.out.println("Mes/ meses de mayor consumo: ");
		for (int i = 0; i < b.size(); i++) {
			System.out.println(Mes.values()[b.get(i)]);
		}
	}

}
