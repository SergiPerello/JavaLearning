package taulesUnidimencionals;

import java.util.Scanner;

public class A60 {
	
	private static int TAMANY=10;
	public static void main(String[] args) {
		/*
		60.Introduir un conjunt de números pel teclat i guardar-los en una taula finalitzant la seqüencia
		amb el 0. Després caldrà calcular la mitja i dir quants números son més grans que la mitja i
		quants son més petits.
		*/
		int []taula=new int [TAMANY];
		int valor=0,suma=0,index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entra valors,escriu (0) per aturar-ho:");
		valor = sc.nextInt();
		while ((index < TAMANY)&&(valor != 0)) {
			taula[index]=valor;
			valor=sc.nextInt();
			index++;
		}
		sc.close();
		if (index > 0) {
			for (int i=0;i<index;i++) suma+=taula[i];
			float mitjana=(float)suma/index;
			System.out.println("La mitjana és: "+mitjana);
			System.out.print("Els valors per sobre de la mitjana són:");
			for (int i=0;i<TAMANY;i++) if (taula[i]>mitjana&&taula[i]!=0) System.out.print(" "+taula[i]);
			System.out.println("");
			System.out.print("Els valors per sota de la mitjana són:");
			for (int i=0;i<TAMANY;i++) if (taula[i]<mitjana&&taula[i]!=0) System.out.print(" "+taula[i]);
		}
		else System.out.println("No hi ha valors per fer els calculs");
	}

}
