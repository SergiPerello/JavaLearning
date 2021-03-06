package uf2_OOP_intro;

//Desenvolupar un programa per tal de demanar un conjunt de n�meros pel teclat, finalitzant la 
//s�rie amb el 0. Una vegada tots els n�meros introdu�ts caldr� dir per a cada n�mero quin �s el seu factorial.
//Caldr� desenvolupar els seg�ent m�todes
//int LlegirEnter();
//int factorial(int numero);  � El factorial d�un n�mero negatiu es 0

public class ex88 {
	
	private static int MAX = 100;
	
	public static void main (String[] args) {
		ex88 programa = new ex88();
		programa.inici();
	}
	
	public void inici() {
		int numero;
		int properaLliure = 0;
		
		cLector teclat = new cLector();
		int[] taula = new int[MAX]; 
		
		numero = teclat.llegirEnter("Introdueix un numero ");
		while ((numero != 0) && (properaLliure < MAX)) {
		    taula[properaLliure] = numero;
		    properaLliure++;
		    
		    numero = teclat.llegirEnter("Introdueix un numero ");
		}
		
		for (int i=0; i<properaLliure;i++) {
			System.out.println("El factorial de " + taula[i] + 
					" es "+ factorial(taula[i]));
		}
	}

	private int factorial (int num) {
		int fact = 1;

		if (num > 0) {
		   for (int i=2; i<=num; i++) {
			  fact=fact*i;   
		   }
		}
		else {
			fact = 0;
		}
		return fact;  // retornem el resultat
	}
	
}	

