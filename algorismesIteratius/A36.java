package algorismesIteratius;

import java.util.Scanner;

public class A36 {

	public static void main(String[] args) {
		/* 36. L�usuari introduir� tants n�meros com vulgui i caldr� mostrar quin �s el valor m�s gran que l�usuari a introdu�t.
		L�usuari posar� el n�mero 0 quan ja no vulgui introduir m�s n�meros no formant part de la seq�encia de n�meros aquest n�mero 0. */
		
		int valor,gran;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		valor=scanner.nextInt();
		gran=valor;
		while(valor!=0) {
			if(valor>gran)
				gran=valor;
			System.out.print("Digues un altre valor: ");
			valor=scanner.nextInt();
		}
		System.out.println("El valor m�s gran �s el: "+gran);
		scanner.close();
		
	}

}
