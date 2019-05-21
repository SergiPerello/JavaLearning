package algorismesSequencials;

import java.util.Scanner;

public class A02 {
	public static void main(String[] args) {
		
		int base=0;
		int alcada=0;
		int area=0;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Digues l'alçada: ");
		base=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digues l'altura: ");
		alcada=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		area=base*alcada/2;
		
		System.out.print("L'area del triangle és: "+area);
		
		
		
		
		
	}
}
