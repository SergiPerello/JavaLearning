package taulesUnidimencionals;

import java.util.Scanner;

public class A63 {
	/*
	63.Introduir valors reals en una taula fins que entrin el valor 0. Posteriorment s'hauran de generar 2
	taules en una posarem el valors positius i en l'altre els negatius. Posteriorment haurem de
	mostrar cada una de les taules en ordre invers per pantalla.
	*/
	private static int T=10;
	public static void main(String[] args) {
		float []taula = new float [T];
		float []positius = new float [T];
		float []negatius = new float [T];
		float valor=0;
		int index=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Entra valors,escriu (0) per aturar-ho:");
		valor = sc.nextFloat();
		while ((index < T)&&(valor != 0)) {
			taula[index]=valor;
			index++;
			valor=sc.nextFloat();
		}
		sc.close();
		
	}
	/*
	// Check how many positive and/or negative numbers
	for (int i : array1) {
	    if (i >= 0) {
	        positive++;
	    }
	    else {
	        negative++;
	    }
	}

	// Make exact size arrays
	pos = new int[positive];
	hc = new int[negative];

	// Reset variables for new purpose
	positive = 0;
	negative = 0;

	//Put numbers in correct array
	for (int i : array1) {
	    if (i >= 0) {
	        pos[positive] = i;
	        positive++;
	    }
	    else {
	        hc[negative] = i;
	        negative++;
	    }
	}

	// Display arrays
	System.out.print("Starter array: ");
	for (int i: array1) {
	    System.out.print(" " + i);
	}

	System.out.print("\nPositive array: ");
	for (int i: pos) {
	    System.out.print(" " + i);
	}

	System.out.print("\nNegative array: ");
	for (int i: hc) {
	    System.out.print(" " + i);
	}

	}
	*/
	

}
