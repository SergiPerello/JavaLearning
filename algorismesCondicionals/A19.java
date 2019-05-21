package algorismesCondicionals;

import java.util.Scanner;

public class A19 {

	public static void main(String[] args) {
		
		/* 19. Fer un algorisme que serveixi tant per calcular l’àrea d’un rectangle com el perímetre d’un rectangle.
		Se li demanarà a l’usuari el valor dels dos costats del rectangle i quina operació vol realitzar (A-àrea i P-perímetre)
		mostrant el resultat segons l’opció indicada per l’usuari. Si l’usuari no indica cap de les dues opcions es mostrarà un missatge d’error. */
		
		char a;
		double s1,s2,answer;
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Programa per calcular l'àrea i/o el perímetre d'un rectangle");
		System.out.print("Quina operació vols realitzar (A-àrea i P-perímetre)? ");
		a=scanner.next().charAt(0);
		scanner.nextLine();
		
		if (a=='a'||a=='A') {
			System.out.println("Has sel·leccionat l'àrea");
			System.out.print("Digues la base del rectangle: ");
			s1=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Digues la alçada del rectangle: ");
			s2=scanner.nextDouble();
			scanner.nextLine();
			
			answer=s1*s2;
			System.out.println("El resultat de l'àrea del rectangle és: "+answer);
		}
		else if (a=='p'||a=='P') {
			System.out.println("Has sel·leccionat el perímetre");
			System.out.print("Digues la base del rectangle: ");
			s1=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Digues la alçada del rectangle: ");
			s2=scanner.nextDouble();
			scanner.nextLine();
			
			answer=s1*2+s2*2;
			System.out.println("El resultat del perímetre del rectangle és: "+answer);
		}
		else
			System.out.print("Ohh, whoops, oohh, t'has equivocat");
			scanner.close();
	}

}
