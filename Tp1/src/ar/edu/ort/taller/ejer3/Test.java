package ar.edu.ort.taller.ejer3;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.ort.taller.ejer2.Atleta;


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
	static double getMayorTiempo(ArrayList<Atleta>atletas) {
		double mayor=atletas.get(0).getSegundos();
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()>mayor) {
				mayor=atletas.get(i).getSegundos();
			}
		}
		return mayor;
	}
	static double getSegundoTiempo(ArrayList<Atleta>atletas) {
		double menor=getMayorTiempo(atletas);
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()<menor&&atletas.get(i).getSegundos()>getMenorTiempo(atletas)) {
				menor=atletas.get(i).getSegundos();
			}
		}
		return menor;
	}
	static double getTercerTiempo(ArrayList<Atleta>atletas) {
		double menor=getMayorTiempo(atletas);
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getSegundos()<menor&&atletas.get(i).getSegundos()>getSegundoTiempo(atletas)) {
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
		ArrayList<Atleta>primero;
		ArrayList<Atleta>segundo;
		ArrayList<Atleta>tercero;
		System.out.println("ingrese un atleta o 'f' para finalizar");
		atleta=input.nextLine();
		while(atleta.equals("f")==false) {
			System.out.println("ingrese los segundos");
			segundos=input.nextDouble();
			miAtleta.setNombre(atleta);
			miAtleta.setSegundos(segundos);
			atletas.add(miAtleta);
			System.out.println("ingrese un atleta o 'f' para finalizar");
			atleta=input.nextLine();
		}
		primero=getAtletasPorSegundos(atletas, getMenorTiempo(atletas));
		segundo=getAtletasPorSegundos(atletas, getSegundoTiempo(atletas));
		tercero=getAtletasPorSegundos(atletas, getTercerTiempo(atletas));
		System.out.println("Primer puesto: ");
		for(int i=0;i<primero.size();i++) {
			System.out.println(primero.get(i).toString());
		}
		System.out.println("Segundo puesto: ");
		for(int i=0;i<segundo.size();i++) {
			System.out.println(segundo.get(i).toString());
		}
		System.out.println("Tercer puesto: ");
		for(int i=0;i<tercero.size();i++) {
			System.out.println(tercero.get(i).toString());
		}
		
	}

}
