package algorismesIteratius;

import java.util.Scanner;

public class examen04 {

	public static void main(String[] args) {
		int valor;
		int primerNumColumna;
		int numeroActual;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriu un valor: ");
		valor=sc.nextInt();
		primerNumColumna=valor;
		sc.close();
		for (int i=1;i<=valor;i++) {
			numeroActual=primerNumColumna;
			for (int j=1; j<=i;j++) {
				System.out.print(numeroActual);
				numeroActual++;
			}
			System.out.println();
			primerNumColumna--;
		}
	}

}
