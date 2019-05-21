package algorismesIteratius;

import java.util.Scanner;

public class A36 {

	public static void main(String[] args) {
		/* 36. L’usuari introduirà tants números com vulgui i caldrà mostrar quin és el valor més gran que l’usuari a introduït.
		L’usuari posarà el número 0 quan ja no vulgui introduir més números no formant part de la seqüencia de números aquest número 0. */
		
		int valor,gran;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		valor=scanner.nextInt();
		gran=valor;
		while(valor!=0) {
			if(valor>gran)
				gran=valor;
			System.out.print("Digues un altre valor: ");
			valor=scanner.nextInt();
		}
		System.out.println("El valor més gran és el: "+gran);
		scanner.close();
		
	}

}
