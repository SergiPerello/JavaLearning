package algorismesSequencials;

import java.util.Scanner;

public class A01 {
	public static void main(String[] args) {
		//Declarem les variables
		int primerNum=0;
		int segonNum=0;
		int resultat=0;
		
		//Declarem el teclat
		Scanner scanner= new Scanner(System.in);
		
		//Demanem els n�meros
		System.out.println("Suma de dos n�peros");
		System.out.print("Diguem el primer n�mero: ");
		primerNum=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Diguem el segon n�mero: ");
		segonNum=scanner.nextInt();
		scanner.nextLine();
		
		//Sumem
		resultat=primerNum+segonNum;
		System.out.println("El resultat �s: "+resultat);
		scanner.close();
	}
}
