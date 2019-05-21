package algorismesCondicionals;

import java.util.Scanner;

public class A25 {

	public static void main(String[] args) {
		
		/* Fer el jocs del pedra, paper i estisora. Demanar a un primer jugador quina figura
		vol, demanar a un segon jugador la seva figura i finalment indicar quin dels dos jugadors a guanyat o si han empatat. 
		Per tal d’unificar les següents lletres simbolitzaran les tres figuers
		‘S’ -> Stone / Pedra
		‘P’ -> Paper / paper
		‘T’ -> Tisora
		Si algun dos dos jugadors introdueix malament la seva figura es mostrarà un missatge d’error i no es donar resultats de la partida. */
		
		char j1, j2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("‘S’ -> Stone");
		System.out.println("‘P’ -> Paper");
		System.out.println("‘T’ -> Tisora");
		System.out.print("Torn del J1: ");
		j1=scanner.next().charAt(0);
		System.out.print("Torn del J2: ");
		j2=scanner.next().charAt(0);
		scanner.close();
		
		if ((j1 == 'S' || j1 == 'P' || j1 == 'T') && (j2 == 'S' || j2 == 'P' || j2 == 'T')) {
			if (j1=='S' && j2=='P' || j1=='P' && j2=='T' || j1=='T' && j2=='S')
				System.out.println("Jugador 2 ha guanyat !!");
			else if (j2=='S' && j1=='P' || j2=='P' && j1=='T' || j2=='T' && j1=='S')
				System.out.println("Jugador 1 ha guanyat !!");
			else
				System.out.println("Empat");
		}
		else
			System.out.println("Error");
	}
}