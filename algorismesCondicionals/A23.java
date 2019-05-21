package algorismesCondicionals;

import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
		
		/* 23. L’ordinador pensa un número entre 1 i 10, l’usuari l’intenta endivinar.
		Si es així mostrar un missatge d’enhorabona en cas contrari indicar que ha fallat i mostrar el número que havia d’endivinar. */
		
		int a,b;
		a=(int)(Math.random()*10+1);
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues un número entre 1 i 10: ");
		b=scanner.nextInt();
		scanner.close();
		
		if (b==a)
			System.out.println("Has guanyat!!");
		else
			System.out.println("Has perdut :(");
		
	}

}
