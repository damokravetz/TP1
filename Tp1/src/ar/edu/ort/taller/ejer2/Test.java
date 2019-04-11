package ar.edu.ort.taller.ejer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Competencia competencia=new Competencia();
		Atleta miAtleta=new Atleta("hola",10);
		Atleta miAtleta1=new Atleta("chau",2);
		Atleta miAtleta2=new Atleta("meme",2);
		competencia.agregarAtleta(miAtleta);
		competencia.agregarAtleta(miAtleta1);
		competencia.agregarAtleta(miAtleta2);
		ArrayList <Atleta>ganadores;
		ganadores=competencia.getGanadores();
		System.out.println("Ganadores: ");
		for(int i=0;i<ganadores.size();i++) {
			System.out.println(ganadores.get(i).toString());
		}

	}

}
