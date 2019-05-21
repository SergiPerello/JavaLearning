package algorismesIteratius;

import java.util.Scanner;

public class A44 {

	public static void main(String[] args) {
		/* 44. Fer l’exercici anterior però cada mes tindrà els dies que li corresponen tenint en compte els anys de traspàs.*/
		
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
		
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			if (day>=1&&day<=31) {
				System.out.println("Data correcte");
			}
			else System.out.println("Data incorrecte");
		}
		else if (month==4||month==6||month==9||month==11) {
			if (day>=1&&day<=30) {
				System.out.println("Data correcte");
			}
			else System.out.println("Data incorrecte");
		}
		else if(month==2) {
			if (entre4&&(!entre100||entre400)) {
				if (day>=1&&day<=29) {
					System.out.println("Data correcte");
				}
				else System.out.println("Data incorrecte");
			}
			else {
				if (day>=1&&day<=28) {
					System.out.println("Data correcte");
				}
				else System.out.println("Data incorrecte");
			}
		}
		else System.out.println("Data incorrecte");
		
		sc.close();
	}
}
