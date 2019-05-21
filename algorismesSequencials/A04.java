package algorismesSequencials;

import java.util.Scanner;

public class A04 {
	public static void main(String[] args) {
		
		int primerValor=0;
		double descompte=0.2;
		double valorFinal=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor inicial: ");
		primerValor=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		valorFinal=primerValor-primerValor*descompte;
		
		System.out.print("El resultat és: "+valorFinal);
		
		
		
		
	}

}
