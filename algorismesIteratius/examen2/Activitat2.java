package algorismesIteratius.examen2;

import java.util.Scanner;

public class Activitat2 {

	public static void main(String[] args) {
		int suma=0,n=0,nParells=0,nSenars=0;
		float mitjana=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introdueix valors (atura amb 0): ");
		int valor = sc.nextInt();
		int gran = valor, petit = valor;
		while (valor!=0) {
			suma += valor;
			if (valor > gran) gran=valor;
			if (valor < petit) petit=valor;
			if (valor%2==0) nParells++;
			else nSenars++;
			n++;
			System.out.print("Un altre valor: ");
			valor = sc.nextInt();
		}
		sc.close();
		mitjana = suma / n;
		System.out.println("\nPrograma finalitzat, els resultats són: ");
		System.out.println("La suma és: "+suma);
		System.out.println("La mitjana és: "+mitjana);
		System.out.println("El més gran: "+gran);
		System.out.println("El més petit: "+petit);
		System.out.println("Quantitat de parells: "+nParells);
		System.out.println("Quantitat de senars: "+nSenars);
	}

}
