package taulesUnidimencionals;

import java.util.Scanner;

public class A62 {
	/*
	62.Donada una taula de N posicions anar demanant a l�usuari un conjunt de n�meros enters,
	finalitzant la seq��ncia amb 0. Cada vegada que s�introdueixi un n�mero el programa haur� de
	dir si aquest n�mero ja l�havia introdu�t i quantes vegades l�ha introdu�t en total.
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
			System.out.println("El valor s'ha introdu�t "+contador+" vegades");
			contador=0;
			valor=sc.nextInt();
			index++;
		}
		sc.close();
	}

}
