package algorismesCondicionals;

import java.util.Scanner;

public class A16 {

	public static void main(String[] args) {
		
		/* 16. Igual que l’anterior però demanar primer el valor de b.
		Si b es diferent a 0 demanar el valor de a, fer el càlcul i mostrar-lo en pantalla.
		Si b es 0 mostrar l’error i no demanar el valor de a. */
		
		double a,b,x;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor de b: ");
		b=scanner.nextDouble();
		scanner.nextLine();
		
		if (b != 0) {
			System.out.print("Digues el valor a: ");
			a=scanner.nextDouble();
			scanner.nextLine();
			x=10*a/b;
			System.out.print(x);
		}
		else {
			System.out.print("Error en tiempo de ejecución");
		}
		scanner.close();
		
		
		
	}

}
