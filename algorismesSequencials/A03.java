package algorismesSequencials;

import java.util.Scanner;

public class A03 {
	public static void main(String[] args) {
		
		double pi=3.1415926535;
		int radi=0;
		double area=0;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Digues el radi del cercle: ");
		radi=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		area=pi*(radi*radi);
		
		System.out.print("L'area és: "+area);
		
		
	}

}
