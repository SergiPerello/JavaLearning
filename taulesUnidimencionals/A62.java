package taulesUnidimencionals;

import java.util.Scanner;

public class A62 {
	/*
	62.Donada una taula de N posicions anar demanant a l’usuari un conjunt de números enters,
	finalitzant la seqüència amb 0. Cada vegada que s’introdueixi un número el programa haurà de
	dir si aquest número ja l’havia introduït i quantes vegades l’ha introduït en total.
	*/
	private static int T=10;
	public static void main(String[] args) {
		int []taula = new int [T];
		int valor=0,index=0,contador=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entra valors,escriu (0) per aturar-ho:");
		valor = sc.nextInt();
		while ((index < T)&&(valor != 0)) {
			taula[index]=valor;
			for (int i=0;i<index;i++) if (valor==taula[i]) contador++;
			System.out.println("El valor s'ha introduït "+contador+" vegades");
			contador=0;
			valor=sc.nextInt();
			index++;
		}
		sc.close();
	}

}
