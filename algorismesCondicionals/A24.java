package algorismesCondicionals;

import java.util.Scanner;

public class A24 {

	public static void main(String[] args) {
		
		/* 24. El mateix que l’exercici anterior però el jugador tindrà 3 intents per encertar el número.
		Es obvi que si l’usuari encerta no necessita d’un altre intent.
		Cada vegada que l’usuari no encerti el número caldrà dir si el número que ell ha introduir es més gran o més petit que el número que ha d’encertar. */
		
		int a,b;
		a=(int)(Math.random()*10+1);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Digues un número entre 1 i 10");
		System.out.print("Primer intent: ");
		b=scanner.nextInt();
		
		if (b==a)
			System.out.println("Has guanyat!!");
		else {
			if (b > a)
				System.out.println("Massa gran");
			else
				System.out.println("Massa petit");
			System.out.print("Segon intent: ");
			b=scanner.nextInt();
			if (b==a)
				System.out.println("Has guanyat!!");
			else {
				if (b > a)
					System.out.println("Massa gran");
				else
					System.out.println("Massa petit");
				System.out.print("Tercer intent: ");
				b=scanner.nextInt();
				if (b==a)
					System.out.println("Has guanyat!!");
				else
					System.out.println("Has perdut :(");
			}
		}
		scanner.close();
	}

}

