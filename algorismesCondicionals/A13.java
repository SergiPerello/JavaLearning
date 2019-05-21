package algorismesCondicionals;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		
		/* 13. Introduir dos números per teclat i indicar quin és més gran dels dos.
		Exemple, si els números son 14 i 9 es resultat a mostrar en pantalla serà.
		El número 14 és més gran que el número 9. */
		
		double valor1=0;
		double valor2=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor 1: ");
		valor1=scanner.nextDouble();
		System.out.print("Digues el valor 2: ");
		valor2=scanner.nextDouble();
		scanner.close();
		
		if (valor1 > valor2)
			System.out.print("El número "+valor1+" és més gran que el número "+valor2);
		else if(valor2 > valor1)
			System.out.print("El número "+valor2+" és més gran que el número "+valor1);
		else
			System.out.print("Els dos números són iguals");
	}
}
