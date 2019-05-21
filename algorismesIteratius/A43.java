package algorismesIteratius;

import java.util.Scanner;

public class A43 {

	public static void main(String[] args) {
		/* 43. Fer un programa de validació d’una data. Heu de tenir en compte els anys de traspàs.
		Aquesta data la llegireu com tres números enters (dia, mes i any).
		En cas que la data sigui correcta s’escriurà data correcta i en cas contrari data incorrecta (per simplificar es considerarà que tots els mesos tenen 30 dies) */
		
		int day, month, year;
		boolean entre4, entre100, entre400;
		Scanner sc = new Scanner (System.in);
		System.out.print("Digues dia mes any, separat per espais o enters: ");
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		
		entre4=year%4==0;
		entre100=year%100==0;
		entre400=year%400==0;
		
		if (month>=1&&month<=12) {
			if (month==2) {
				if (entre4&&(!entre100||entre400)) {
					if (day>=1&&day<=29) {
						System.out.println("Data correcte");
					}
					else {
						System.out.println("Data incorrecte");
					}
				}
				else {
					if (month==2) {
						if (day>=1&&day<=28) {
							System.out.println("Data correcte");
						}
						else {
							System.out.println("Data incorrecte");
						}
					}
					else {
						if (day>=1&&day<=30){
							System.out.println("Data correcte");
						}
						else {
							System.out.println("Data incorrecte");
						}
					}
				}
			}
			else {
				if (day>=1&&day<=30){
					System.out.println("Data correcte");
				}
				else {
					System.out.println("Data incorrecte");
				}
			}
		}
		else {
			System.out.println("Data incorrecte");
		}
		sc.close();
	}
}
