package algorismesIteratius;

import java.util.Scanner;

public class A32 {

	public static void main(String[] args) {
		/* 32. L’usuari introduirà 10 números i caldrà calcular i mostrar la mitja aritmètica. */
		
		int num, suma=0;
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print("Digues un valor: ");
			num=scanner.nextInt();
			suma=suma+num;
		}
		System.out.print("La mitjana és: "+(suma/10));
		scanner.close();
	}

}
