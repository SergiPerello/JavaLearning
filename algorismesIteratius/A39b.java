package algorismesIteratius;

import java.util.Scanner;

public class A39b {
	public static void main(String[] args) {
		
		int recompte, a=1, b=1, resultat=0;
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("Quants números de fibonacci vols: ");
		recompte=scanner.nextInt();
		if (recompte < 2)
			System.out.print("No es pot fer fibonacci");
		else {
			recompte=recompte-2;
			System.out.println(a);
			System.out.println(b);
			while(recompte!=0) {
				--recompte;
				resultat=a+b;
				System.out.println(resultat);
				a=b;
				b=resultat;
			}
		}
		scanner.close();
	}
}
