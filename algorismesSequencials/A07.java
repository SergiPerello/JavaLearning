package algorismesSequencials;

import java.util.Scanner;

public class A07 {

	public static void main(String[] args) {
		
		int A=0;
		int B=0;
		int C=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor A: ");
		A=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digues el valor B: ");
		B=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		C=B;
		B=A;
		A=C;
		
		System.out.println("El valor A és: "+A);
		System.out.println("El valor B és: "+B);
		
	}

}
