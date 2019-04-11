package ar.edu.ort.taller.ejer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner input;
	static double getMenorTiempo(ArrayList<Atleta>atletas) {
		double menor=atletas.get(0).getSegundos();
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()<menor) {
				menor=atletas.get(i).getSegundos();
			}
		}
		return menor;
	}
	static ArrayList<Atleta> getAtletasPorSegundos(ArrayList <Atleta> atletas, double segundos){
		ArrayList<Atleta> misAtletas=new ArrayList<Atleta>();
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()==segundos) {
				misAtletas.add(atletas.get(i));
			}
		}
		return misAtletas;
	}
	public static void main(String[] args) {
		input=new Scanner(System.in);
		String atleta="";
		double segundos;
		Atleta miAtleta=new Atleta("",0);
		ArrayList<Atleta>atletas=new ArrayList<Atleta>();
		ArrayList<Atleta>ganadores;
		System.out.println("ingrese un atleta o 'f' para finalizar");
		atleta=input.nextLine();
		while(atleta.equals("f")==false) {
			System.out.println("ingrese los segundos");
			segundos=input.nextDouble();
			miAtleta.setNombre(atleta);
			miAtleta.setSegundos(segundos);
			atletas.add(miAtleta);
			System.out.println("ingrese un atleta o 'f' para finalizar");
			input.nextLine();
			atleta=input.nextLine();
		}
		ganadores=getAtletasPorSegundos(atletas, getMenorTiempo(atletas));
		System.out.println("Ganadores: ");
		for(int i=0;i<ganadores.size();i++) {
			System.out.println(ganadores.get(i).toString());
		}
		
		

	}

}
