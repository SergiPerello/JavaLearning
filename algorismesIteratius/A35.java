package algorismesIteratius;

import java.util.Scanner;

public class A35 {

	public static void main(String[] args) {
		/* 35. L�usuari introduir� tants n�meros com vulgui i caldr� calcular i mostrar la mitjana dels n�meros introdu�ts.
		L�usuari posar� el n�mero 0 quan ja no vulgui introduir m�s n�meros no formant part de la seq�encia de n�meros aquest n�mero 0.
		Vigilar que passa si l�usuari no entra cap n�mero. */
		
		int valor;
		int suma = 0;
		int numeros=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Digues un valor: ");
		valor=scanner.nextInt();
		while(valor!=0) {
			numeros++;
			suma=suma+valor;
			System.out.print("Digues un altre valor: ");
			valor=scanner.nextInt();
		}
		if(numeros==0)
			System.out.println("Has sortir del programa");
		else
			System.out.println("Mitjana: "+((double)suma/numeros));
		scanner.close();
	}
}