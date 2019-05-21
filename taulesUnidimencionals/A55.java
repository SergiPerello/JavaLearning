package taulesUnidimencionals;

import java.util.Scanner;

public class A55 {
	/* Donada una taula de n elements enters, introduïts per l’usuari, fer un algoritme que ens indiqui
	quants d’aquests són negatius i quants no. El zero es considera neutre. */
	private static int TAMANY=10;
	public static void main(String[] args) {
		int positiu=0,negatiu=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Digues "+TAMANY+" numeros i et diré la quants són positius i quants no: ");
		int []taula=new int [TAMANY];
		for (int i=0;i<taula.length;i++) {
			taula[i]=sc.nextInt();
			if (taula[i]>0) positiu++;
			else if (taula[i]<0) negatiu++;
		}
		sc.close();
		System.out.println("En tenim "+positiu+" de positius");
		System.out.println("En tenim "+negatiu+" de negatius");
	}
}
