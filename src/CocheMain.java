import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CocheMain {
	public static void main(String[] args) {
	
		crearCoches();
		System.out.println("Coches Guardados:");
		mostrarCoches();
		System.out.println("El coches con mas kilometros es \n" + maxKilometros());
		mostrarPorKm();
	}
	
	
	/*
	 * Funciones
	 */
	static ArrayList<Coche> coches  = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	public static void crearCoches() {	
	
	
	String Matricula, Marca, Modelo;
	int Km, cantidadCoches;
	Coche Aux;

	 do {
         System.out.print("Número de coches? ");
          cantidadCoches = scan.nextInt();
     } while (cantidadCoches < 0);
	 
	 scan.nextLine();
	 
	 for(int i = 1; i <= cantidadCoches; i++) {
		 System.out.println("introduce la matricula");
		 Matricula = scan.nextLine();
		 System.out.println("introduce la marca");
		 Marca = scan.nextLine();
		 System.out.println("Introduce el modelo");
		 Modelo = scan.nextLine();
		 System.out.println("Introduce los kilometros");
		 Km = scan.nextInt();
		 
		 scan.nextLine();
		 
		 Aux = new Coche();
	
		 Aux.setMatricula(Matricula);
		 Aux.setMarca(Marca);
		 Aux.setModelo(Modelo);
		 Aux.setKm(Km);
	
		 coches.add(Aux);
	}
	}
	
	
	public static void  mostrarCoches() {
		Iterator<Coche> iterator = coches.iterator();
		while(iterator.hasNext()) {
			Object element = iterator.next();
	         System.out.println(element);
		}
	}
	
	
	public static void mostrarPorKm() {
		System.out.println("Introduce la cantidad maxima de Kilometros para el coche");
		int km  = scan.nextInt();
		for(int i = 0; i < coches.size(); i++) {
			if(coches.get(i).getKm() < km) {
				System.out.println(coches.get(i));
			}
		}
			
	}
	
	public static Coche maxKilometros() {
		Coche Mayor = coches.get(0);
		for(int i = 0; i< coches.size(); i++) {
			if(coches.get(i).getKm() > Mayor.getKm()) {
				Mayor = coches.get(i);
			}
		}
		return Mayor;
	}
	
	
	
}
