package algorismesCondicionals;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		
		/* 13. Introduir dos n�meros per teclat i indicar quin �s m�s gran dels dos.
		Exemple, si els n�meros son 14 i 9 es resultat a mostrar en pantalla ser�.
		El n�mero 14 �s m�s gran que el n�mero 9. */
		
		double valor1=0;
		double valor2=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor 1: ");
		valor1=scanner.nextDouble();
		System.out.print("Digues el valor 2: ");
		valor2=scanner.nextDouble();
		scanner.close();
		
		if (valor1 > valor2)
			System.out.print("El n�mero "+valor1+" �s m�s gran que el n�mero "+valor2);
		else if(valor2 > valor1)
			System.out.print("El n�mero "+valor2+" �s m�s gran que el n�mero "+valor1);
		else
			System.out.print("Els dos n�meros s�n iguals");
	}
}
