package algorismesIteratius;

import java.util.Scanner;

public class A38 {

	public static void main(String[] args) {
		/* 38. Visualitzar els N primers nombres parells positius, sent N un valor entrat per teclat.
		Exemple, si l’usuari indica el número 5 caldrà mostrar en pantalla.
		2 4 6 8 10 */
		
		int voltes;
		int valor=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el nombre de números parells que vols veure: ");
		voltes=scanner.nextInt();
		if (voltes<0) System.out.print("Introdueix un valor positiu");
		else {
			for (int i=0; i<voltes;i++) {
				valor=valor+2;
				System.out.println(valor+" ");
			}
		}
		scanner.close();
	}
}