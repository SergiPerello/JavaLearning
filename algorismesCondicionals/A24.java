package algorismesCondicionals;

import java.util.Scanner;

public class A24 {

	public static void main(String[] args) {
		
		/* 24. El mateix que l�exercici anterior per� el jugador tindr� 3 intents per encertar el n�mero.
		Es obvi que si l�usuari encerta no necessita d�un altre intent.
		Cada vegada que l�usuari no encerti el n�mero caldr� dir si el n�mero que ell ha introduir es m�s gran o m�s petit que el n�mero que ha d�encertar. */
		
		int a,b;
		a=(int)(Math.random()*10+1);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Digues un n�mero entre 1 i 10");
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

