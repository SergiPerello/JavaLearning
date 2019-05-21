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
		
		//Demanem els números
		System.out.println("Suma de dos núperos");
		System.out.print("Diguem el primer número: ");
		primerNum=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Diguem el segon número: ");
		segonNum=scanner.nextInt();
		scanner.nextLine();
		
		//Sumem
		resultat=primerNum+segonNum;
		System.out.println("El resultat és: "+resultat);
		scanner.close();
	}
}
