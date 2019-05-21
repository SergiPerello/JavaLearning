package taulesUnidimencionals;

import java.util.Scanner;

public class A54 {
	/* Donada una taula de n elements de enters, introduïts per l’usuari,
	fer un algoritme que ens digui la suma total dels elements de la taula. */
	
	private static int TAMANY=10;
	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Digues "+TAMANY+" numeros i et diré la suma d'aquests: ");
		int []taula=new int [TAMANY];
		for (int i=0;i<taula.length;i++) {
			taula[i]=sc.nextInt();
			total+=taula[i];
		}
		sc.close();
		System.out.println(total);
	}
}