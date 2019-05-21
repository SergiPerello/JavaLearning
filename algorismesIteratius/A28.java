package algorismesIteratius;

import java.util.Scanner;

public class A28 {

	public static void main(String[] args) {
		/* 28. Introduir un número i que es visualitzi la seva taula de multiplicar del 1 al 10. */
		int a;
		int b = 0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un numero: ");
		a=scanner.nextInt();
		scanner.close();
		
		for(b=1; b < 11; b++) {
			System.out.println(a+"*"+b+"="+a*b);
		}
		
	}

}
