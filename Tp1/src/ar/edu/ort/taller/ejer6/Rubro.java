package ar.edu.ort.taller.ejer6;

public class Rubro {
	private String nombre;
	private static final int TOTAL_MESES = 12;
	private double[] gastosPorMes;

	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}

	private void inicializarGastos() {
		this.gastosPorMes = new double[12];
		for (int i = 0; i < gastosPorMes.length; i++) {
			gastosPorMes[i] = 0;
		}
	}

	public void agregarGasto(Mes mes, double importe) {
		gastosPorMes[mes.ordinal()] += importe;
	}

	public double getTotalGastos(Mes mes) {
		return gastosPorMes[mes.ordinal()];
	}

	public String getNombre() {
		return nombre;
	}
}
