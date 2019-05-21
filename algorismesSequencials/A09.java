package algorismesSequencials;

import java.util.Scanner;

public class A09 {

	public static void main(String[] args) {
		
		int x=0;
		int result=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Operació: X^3 + 3X^2 + 7X +7");
		System.out.print("Digues el valor de X: ");
		x=scanner.nextInt();
		scanner.close();
		
		result= (x*x*x) + (3*x*x) + (7*x) + 7;
		
		System.out.print("El resultat és: "+result);
		

	}

}
