package algorismesSequencials;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {
		
		double euros=0;
		double dollars=0;
		double factorConversio=1.2712;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Quants euros vols passar a dollars?");
		euros=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		
		dollars=euros*factorConversio;
		
		System.out.print("El resultat en dollars és: "+dollars);
		
	}

}
