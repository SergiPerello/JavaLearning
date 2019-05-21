package algorismesCondicionals;

import java.util.Scanner;

public class A18 {

	public static void main(String[] args) {
		
		/* 18. Llegir una caràcter pel teclat i mostrar els següents resultats segons la lletra apretada.
		‘A’ = BON DIA
		‘B’ = BONA NIT
		‘C’	= WAKE-UP
		Si l’usuari no indica cap d’aquestes 3 lletres es mostrarà un missatge dient ‘MI NO ENTENDER’
		Preveure que l’usuari pot introduir el caràcter en majúscules o minúscules. */
		
		char a;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("A, B o C?");
		a = scanner.next().charAt(0);
		scanner.close();
		
		if (a=='a'||a=='A')
			System.out.print("BON DIA !!!");
		else if (a=='b'||a=='B')
			System.out.print("BONA NIT !!!");
		else if (a=='c'||a=='C')
			System.out.print("WAKE UP !!!");
		else
			System.out.print("MI NO ENTENDER");
	}

}
