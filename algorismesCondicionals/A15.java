package algorismesCondicionals;

import java.util.Scanner;

public class A15 {

	public static void main(String[] args) {
		
		/* 15. Cal fer un programa per resoldre l�equaci� x=10*a/b.
		Demanar per teclat el valor de a i b per a calcular el valor de X i mostrar-lo en pantalla.
		Vigilar que la divisi� per cero dona un error, si aix� succeix mostrar un missatge dient que no es pot calcular l�equaci�. */
		
		double a,b,x;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor a: ");
		a=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Digues el valor b: ");
		b=scanner.nextDouble();
		scanner.close();
		
		if (b==0)
			System.out.print("No es pot calcular l'equaci�");
		else {
			x=10*a/b;
			System.out.print(x);
		}
		
		
	}

}
