package ar.edu.ort.taller.ejer3;

import java.util.ArrayList;

public class Competencia {
private ArrayList<Atleta>atletas;
	
	public Competencia() {
		atletas=new ArrayList<Atleta>();
	}
	
	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}
	
	public double[] getTiempos() {
		double[] res=new double[3];
		res[0]=atletas.get(0).getSegundos();
		res[1]=atletas.get(0).getSegundos();
		res[2]=atletas.get(0).getSegundos();
		for(int i =0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()<res[2]) {
				if(atletas.get(i).getSegundos()<res[1]) {
					if(atletas.get(i).getSegundos()<res[0]) {
						res[2]=res[1];
						res[1]=res[0];
						res[0]=atletas.get(i).getSegundos();
					}else {
						res[2]=res[1];
						res[1]=atletas.get(i).getSegundos();
					}
				}else {
					res[2]=atletas.get(i).getSegundos();
				}
			}
		}
		if(res[2]==res[1]||res[2]==res[0]) {
			res[2]=-1;
		}
		if(res[1]==res[0]) {
			res[1]=-1;
		}
		return res;
	}
	
	public ArrayList <Atleta> buscarAtletasPorTiempos(double segundos) {
		ArrayList <Atleta> misAtletas=new ArrayList <Atleta>();
		if(segundos!=-1) {
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()==segundos) {
				misAtletas.add(atletas.get(i));
			}
		}
		}
		return misAtletas;
	}

}
