import java.util.Scanner;

public class ExTaulesAlgoritmesBasics {
	public static int TAMANY = 100;
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		// declarem la taula del tamany de la constant
		int[] Taula = new int[TAMANY];
		int index;
		int valor;
		int properaLliure;
		
		// 1. RECORREGUT TOTAL, TAULA FISICA
		// En aquest exemple inicialitzem tota la taula a 0
		for (index = 0; index < TAMANY; index++) {
			Taula[index] = 0;
		}
		
		// 2. FARCIM ORDENADAMENT.
		// En aquest exemple demanem dades fins que ens posin un 0.
		properaLliure = 0;
		
		System.out.println("Entra valors fins a 0, maxim " + TAMANY + " valors ");
		valor = lector.nextInt();
		while ((properaLliure < TAMANY) && (valor != 0)) {
			// posem el valor a la primera lliure
			Taula[properaLliure] = valor;
			properaLliure++;
			
			// Seguent valor
			valor = lector.nextInt();
		}
		
		// 3. RECORREGUT CASELLES PLENES, TAULA LOGICA
		// En aquest exemple busquem el mes gran.
		int max;
		max = Taula[0];
		
		for (index=0; index < properaLliure; index++) {
			if (Taula[index] > max) {
				max = Taula[index];
			}
		}
		
		System.out.println("El maxim es: " + max);
		
		// 4. BUSCAR UN VALOR A LA TAULA
		// En l'exemple demanem un numero i diem si hi es o no.
		System.out.println("Quin valor vols buscar? ");
		valor = lector.nextInt();
		
		index = 0;
		while (valor != Taula[index] && index < properaLliure) {
			index++;
		}
		
		// Al sortir mirem si l'ha localitzat
		if (index < properaLliure) {
			System.out.println("Valor trobat el valor a la taula");
		}
		else {
			System.out.println("Valor NO trobat a la taula");
		}
		
		
		lector.close();
		
	}

}
