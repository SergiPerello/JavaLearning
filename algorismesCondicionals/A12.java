package algorismesCondicionals;

import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		
		//12. Introduir un n�mero i mostrar en pantalla si �s positiu, negatiu o 0.
		
		double valor=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		valor=scanner.nextDouble();
		scanner.close();
		
		if (valor > 0) {
			System.out.print("El valor �s positiu");
		}
		else if (valor==0) {
			System.out.print("El valor �s 0");
		}
		else if (valor < 0) {
			System.out.print("El valor �s negatiu");
		}
		
	}

}
