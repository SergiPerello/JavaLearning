package algorismesIteratius;

import java.util.Scanner;

public class A34 {

	public static void main(String[] args) {
		 /* 34. L�usuari introduir� tants n�meros com vulgui i caldr� calcular i mostrar la suma els n�meros introdu�ts.
		 L�usuari posar� el n�mero 0 quan ja no vulgui introduir m�s n�meros no formant part de la seq�encia de n�meros aquest n�mero 0. */
		
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
