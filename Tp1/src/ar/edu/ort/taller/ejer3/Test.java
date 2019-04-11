package ar.edu.ort.taller.ejer3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Competencia competencia=new Competencia();
		Atleta miAtleta=new Atleta("hola",10);
		Atleta miAtleta1=new Atleta("chau",2);
		Atleta miAtleta2=new Atleta("meme",5);
		competencia.agregarAtleta(miAtleta);
		competencia.agregarAtleta(miAtleta1);
		competencia.agregarAtleta(miAtleta2);
		double[]a=competencia.getTiempos();
		ArrayList<Atleta>primeros=competencia.buscarAtletasPorTiempos(a[0]);
		ArrayList<Atleta>segundos=competencia.buscarAtletasPorTiempos(a[1]);
		ArrayList<Atleta>terceros=competencia.buscarAtletasPorTiempos(a[2]);
		System.out.println("Primeros:");
		for(int i=0;i<primeros.size();i++) {
			System.out.println(primeros.get(i).toString());
		}
		System.out.println("Segundos:");
		for(int i=0;i<segundos.size();i++) {
			System.out.println(segundos.get(i).toString());
		}
		System.out.println("Terceros:");
		for(int i=0;i<terceros.size();i++) {
			System.out.println(terceros.get(i).toString());
		}
		
		

}
}
