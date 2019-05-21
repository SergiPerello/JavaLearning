package algorismesCondicionals;

import java.util.Scanner;

public class A19 {

	public static void main(String[] args) {
		
		/* 19. Fer un algorisme que serveixi tant per calcular l��rea d�un rectangle com el per�metre d�un rectangle.
		Se li demanar� a l�usuari el valor dels dos costats del rectangle i quina operaci� vol realitzar (A-�rea i P-per�metre)
		mostrant el resultat segons l�opci� indicada per l�usuari. Si l�usuari no indica cap de les dues opcions es mostrar� un missatge d�error. */
		
		char a;
		double s1,s2,answer;
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Programa per calcular l'�rea i/o el per�metre d'un rectangle");
		System.out.print("Quina operaci� vols realitzar (A-�rea i P-per�metre)? ");
		a=scanner.next().charAt(0);
		scanner.nextLine();
		
		if (a=='a'||a=='A') {
			System.out.println("Has sel�leccionat l'�rea");
			System.out.print("Digues la base del rectangle: ");
			s1=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Digues la al�ada del rectangle: ");
			s2=scanner.nextDouble();
			scanner.nextLine();
			
			answer=s1*s2;
			System.out.println("El resultat de l'�rea del rectangle �s: "+answer);
		}
		else if (a=='p'||a=='P') {
			System.out.println("Has sel�leccionat el per�metre");
			System.out.print("Digues la base del rectangle: ");
			s1=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Digues la al�ada del rectangle: ");
			s2=scanner.nextDouble();
			scanner.nextLine();
			
			answer=s1*2+s2*2;
			System.out.println("El resultat del per�metre del rectangle �s: "+answer);
		}
		else
			System.out.print("Ohh, whoops, oohh, t'has equivocat");
			scanner.close();
	}

}
