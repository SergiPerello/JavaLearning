package algorismesCondicionals;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		
		/* 14. Introduir 4 números i dir si la suma dels dos primers és més gran, igual o més petit que la suma dels 2 següents.
		Exemple, si els números son 5, 7 10, 1 el resultat a mostrar en pantalla serà.
		La suma dels dos primers: 12
		La suma dels dos últims: 11
		La suma dels primers és més gran que la suma dels últims. */
		
		double v1,v2,v3,v4;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor 1: ");
		v1=scanner.nextDouble();
		System.out.print("Digues el valor 2: ");
		v2=scanner.nextDouble();
		System.out.print("Digues el valor 3: ");
		v3=scanner.nextDouble();
		System.out.print("Digues el valor 4: ");
		v4=scanner.nextDouble();
		scanner.close();
		
		System.out.println("La suma dels dos primers: "+(v1+v2));
		System.out.println("La suma dels dos últims: "+(v3+v4));
		
		if (v1+v2 > v3+v4)
			System.out.print("La suma dels primers és més gran que la suma dels últims.");
		else if (v1+v2 < v3+v4)
			System.out.print("La suma dels primers és més petita que la suma dels últims.");
		else if (v1+v2 == v3+v4)
			System.out.print("La suma dels primers és igual que la suma dels últims.");
	}
}