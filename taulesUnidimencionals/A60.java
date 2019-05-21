package taulesUnidimencionals;

import java.util.Scanner;

public class A60 {
	
	private static int TAMANY=10;
	public static void main(String[] args) {
		/*
		60.Introduir un conjunt de n�meros pel teclat i guardar-los en una taula finalitzant la seq�encia
		amb el 0. Despr�s caldr� calcular la mitja i dir quants n�meros son m�s grans que la mitja i
		quants son m�s petits.
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
			System.out.println("La mitjana �s: "+mitjana);
			System.out.print("Els valors per sobre de la mitjana s�n:");
			for (int i=0;i<TAMANY;i++) if (taula[i]>mitjana&&taula[i]!=0) System.out.print(" "+taula[i]);
			System.out.println("");
			System.out.print("Els valors per sota de la mitjana s�n:");
			for (int i=0;i<TAMANY;i++) if (taula[i]<mitjana&&taula[i]!=0) System.out.print(" "+taula[i]);
		}
		else System.out.println("No hi ha valors per fer els calculs");
	}

}
