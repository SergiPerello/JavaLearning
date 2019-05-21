package algorismesSequencials;

import java.util.Scanner;

public class A05 {
	public static void main(String[] args) {
		
		int primerValor=0;
		double descompte=0;
		double valorFinal=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor inicial: ");
		primerValor=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digues el descompte a aplicar: ");
		descompte=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		descompte=descompte/100;
		valorFinal=primerValor-primerValor*descompte;
		
		System.out.print("El resultat és: "+valorFinal);
		
		
		
		
	}

}
