package taulesUnidimencionals;

import java.util.Scanner;

public class A56 {
	/* Realitzar un algoritme que ens permeti entra n nombres enters en una taula i a continuació que
	inverteixi la taula (el primer element passa a l’últim introduït, el segon al penúltim,...). Una
	vegada invertida la taula mostrar-la per pantalla. */
	private static int TAMANY=10;
	public static void main(String[] args) {		
		/* -------------- FORMA POC EFICIENT 2 ARRAYS -------------
		Scanner sc=new Scanner(System.in);
		int []taula=new int [TAMANY];
		int []taula1=new int [TAMANY];
		int j=taula.length-1;
		for (int i=0;i<TAMANY;i++) {
			taula[i]=sc.nextInt();
		}
		for (int i=0;i<taula.length;i++) {
			taula1[i]=taula[j];
			j--;
		}
		sc.close();
		for (int i=0;i<TAMANY;i++) {
			System.out.print(taula[i]+" ");
		}
		for (int i=0;i<TAMANY;i++) {
			System.out.print(taula1[i]+" ");
		}
		*/
		
		/* FORMA MÉS EFICIENT 1 ARRAY*/
		int []taula=new int [TAMANY];
		int a;
		int b=TAMANY-1;
		int c=TAMANY/2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Digues 10 valors:");
		for (int i=0;i<TAMANY;i++) taula[i]=sc.nextInt();
		sc.close();
		for (int i=0;i<c;i++) {
			a=taula[i];
			taula[i]=taula[b];
			taula[b]=a;
			b--;
		}
		for (int i=0;i<TAMANY;i++) System.out.print(taula[i]+" ");
	}
}
