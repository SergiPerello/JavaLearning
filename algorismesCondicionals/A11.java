package algorismesCondicionals;

import java.util.Scanner;

public class A11 {
	
	public static void main(String[] args) {
		
		//11. Introduir un número i mostrar en pantalla es o no superior a 0.
		
		double valor=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		valor=scanner.nextDouble();
		scanner.close();
		
		if (valor >= 0) {
			System.out.print("El valor es igual o superior a 0");
		}
		else
			System.out.print("El valor es inferior a 0");
		
	}

}
