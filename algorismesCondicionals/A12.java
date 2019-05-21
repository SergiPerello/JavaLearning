package algorismesCondicionals;

import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		
		//12. Introduir un número i mostrar en pantalla si és positiu, negatiu o 0.
		
		double valor=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		valor=scanner.nextDouble();
		scanner.close();
		
		if (valor > 0) {
			System.out.print("El valor és positiu");
		}
		else if (valor==0) {
			System.out.print("El valor és 0");
		}
		else if (valor < 0) {
			System.out.print("El valor és negatiu");
		}
		
	}

}
