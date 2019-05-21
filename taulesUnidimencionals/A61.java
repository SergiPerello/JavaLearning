package taulesUnidimencionals;

import java.util.Scanner;

public class A61 {
	/*
	61.Un nombre perfecte �s aquell que �s igual a la suma dels seus divisors excloent ell mateix.
	Realitzar un algoritme que permeti llegir una seq��ncia de nombres enters positius finalitzant
	amb la seq��ncia amb el 0.
	Despr�s dir de cada un d�aquests quins s�n perfectes i dels perfectes quin �s el m�s gran.
	*/
	private static int T=10;
	public static void main(String[] args) {
		int []taula=new int [T];
		int valor=0,suma=0,index=0,gran=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entra valors,escriu (0) per aturar-ho:");
		valor = sc.nextInt();
		while ((index < T)&&(valor != 0)) {
			if (valor > 0) taula[index]=valor;
			else {
				index--;
				System.out.println("Introdueix un valor positiu");
			}
			valor=sc.nextInt();
			gran=valor;
			index++;
		}
		sc.close();
		
		for (int i=0;i<index;i++) {
			suma=0;
			for (int j=1;j<taula[i];j++) if (taula[i]%j==0) suma+=j;
			if (suma==taula[i]) {
				gran=taula[i];
				System.out.println("Numero perfecte: "+taula[i]);
			}
		}
		System.out.print("El m�s gran �s: "+gran);
	}
}