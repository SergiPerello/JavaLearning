package algorismesIteratius;

import java.util.Scanner;

public class A34 {

	public static void main(String[] args) {
		 /* 34. L’usuari introduirà tants números com vulgui i caldrà calcular i mostrar la suma els números introduïts.
		 L’usuari posarà el número 0 quan ja no vulgui introduir més números no formant part de la seqüencia de números aquest número 0. */
		
		int valor;
		int suma=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Digues un valor a sumar: ");
		valor=scanner.nextInt();
		while(valor != 0) {
			suma=suma+valor;
			System.out.println("Resultat de la suma: "+suma);
			System.out.print("Digues un valor a sumar: ");
			valor=scanner.nextInt();
		}
		System.out.println("Total: "+suma);
		scanner.close();
		
	}

}
