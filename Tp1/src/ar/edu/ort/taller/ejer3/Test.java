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
		
		
		

}
}
