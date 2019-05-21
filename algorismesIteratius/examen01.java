package algorismesIteratius;

import java.util.Scanner;

public class examen01 {

	public static void main(String[] args) {
		int valor1, valor2, r_valor1=0, r_valor2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Digues el primer valor: ");
		valor1=sc.nextInt();
		System.out.print("Digues el segon valor: ");
		valor2=sc.nextInt();
		
		System.out.print("Divisors de "+valor1+": ");
		for (int i=1;i!=valor1;i++){
			if (valor1%i==0) {
				r_valor1=r_valor1+i;
				System.out.print(i+" ");
			}
		}
		sc.close();
		
		System.out.println(" ");
		System.out.print("Divisors de "+valor2+": ");
		for (int j=1;j!=valor2;j++){
			if (valor2%j==0) {
				r_valor2=r_valor2+j;
				System.out.print(j+" ");
			}
		}
		System.out.println(" ");
		System.out.println("La suma dels divisors de "+valor1+" es "+r_valor1);
		System.out.println("La suma dels divisors de "+valor2+" es "+r_valor2);
		if (r_valor1>r_valor2)
			System.out.println("Resultat: "+valor1+" es el número que té la suma de divisors més gran");
		else if (r_valor1<r_valor2)
			System.out.println("Resultat: "+valor2+" es el número que té la suma de divisors més gran");
		else
			System.out.println("La suma dels divisors donen el mateix");
	}
	
}
