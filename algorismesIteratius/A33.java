package algorismesIteratius;

import java.util.Scanner;

public class A33 {

	public static void main(String[] args) {
		/* 33. Comptar el nombre d�enters negatius d�una s�rie d�enters que anem llegint i que finalitza amb el n�mero zero. */
		
		int valor = 1;
		int negatius=0;
		
		Scanner scanner=new Scanner(System.in);
		
		while(valor != 0) {
			System.out.print("Digues un valor: ");
			valor=scanner.nextInt();
			if(valor < 0)
				negatius++;
		}
		System.out.println("El nombre de negatius �s: "+negatius);
		scanner.close();
	}

}
