package algorismesCondicionals;

import java.util.Scanner;

public class A18 {

	public static void main(String[] args) {
		
		/* 18. Llegir una car�cter pel teclat i mostrar els seg�ents resultats segons la lletra apretada.
		�A� = BON DIA
		�B� = BONA NIT
		�C�	= WAKE-UP
		Si l�usuari no indica cap d�aquestes 3 lletres es mostrar� un missatge dient �MI NO ENTENDER�
		Preveure que l�usuari pot introduir el car�cter en maj�scules o min�scules. */
		
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
