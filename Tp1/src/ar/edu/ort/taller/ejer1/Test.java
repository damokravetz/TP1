package ar.edu.ort.taller.ejer1;

public class Test {
	static void comprobarIntegrante(Grupo g, Integrante i){
		if(g.buscarIntegrante(i.getNombre())!=null) {
			System.out.println("El integrante "+i.getNombre()+" ha sido añadido correctamente.");
		}else {
			System.out.println("El integrante "+i.getNombre()+" no ha sido añadido.");
		}
	}

	public static void main(String[] args) {
		Grupo grupo=new Grupo("Grupo1");
		Integrante integrante1=new Integrante ("Leandro");
		grupo.agregarIntegrante(integrante1);
		System.out.println(integrante1.getNombre()+" fue asignado al grupo "+grupo.getNombre());
		comprobarIntegrante(grupo, integrante1);
		Integrante integrante4=new Integrante ("Pablo");
		comprobarIntegrante(grupo, integrante4);
		Integrante integrante2=new Integrante ("Damian");
		grupo.agregarIntegrante(integrante2);
		System.out.println(integrante2.getNombre()+" fue asignado al grupo "+grupo.getNombre());
		Integrante integrante3=new Integrante ("Juan");
		grupo.agregarIntegrante(integrante3);
		System.out.println(integrante3.getNombre()+" fue asignado al grupo "+grupo.getNombre());
		grupo.mostrar();
		System.out.println(grupo.removerIntegrante("Juan").toString());
		grupo.removerIntegrante("Juan");
		grupo.mostrar();
		grupo.vaciar();
		grupo.mostrar();

	}

}
