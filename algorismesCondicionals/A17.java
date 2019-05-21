package algorismesCondicionals;

import java.util.Scanner;

public class A17 {

	public static void main(String[] args) {
		
		/* 17. Tenint en compte que una equació de segon grau té aquest format: aX2 +bX+c=0.
		Demanar per teclat el valor de a , b i c per a calcular els dos valors de X.
		Recordeu que una equació de segon grau dona dos resultats i que s’han de controlar dos errors.
		1. No es pot dividir per 0.
		2. No es pot calcular una arrel cuadrada d’un número negatiu. */

		double a,b,c,x1,x2;//Creació de variables
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor a: ");//Demanem els valors i els guardem
		a=scanner.nextDouble();
		System.out.print("Digues el valor b: ");
		b=scanner.nextDouble();
		System.out.print("Digues el valor c: ");
		c=scanner.nextDouble();
		scanner.close();
		
		if (a==0)//Comprovació de la divisió entre 0
			System.out.print("No es pot dividir entre 0");
		else if (b*b-4*a*c >= 0) {
			x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
			x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
			System.out.println("Els resultats són:");//Exposició dels resultats
			System.out.println("x1: "+x1);
			System.out.println("x2: "+x2);
		}
		else
			System.out.println("No es pot calcular una arrel cuadrada d’un número negatiu");//Missatge d'error
	}

}
