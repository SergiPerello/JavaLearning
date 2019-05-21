package algorismesSequencials;

import java.util.Scanner;

public class A08 {

	public static void main(String[] args) {
		
		int A=0, B=0, C=0, D=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor A: ");
		A=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digues el valor B: ");
		B=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digues el valor C: ");
		C=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		D=B;
		B=A;
		A=C;
		C=D;
		
		System.out.println("El valor A és: "+A);
		System.out.println("El valor B és: "+B);
		System.out.println("El valor C és: "+C);

	}

}
