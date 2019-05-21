package algorismesCondicionals;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		
		// 21. Igual que l’anterior però l’usuari introduirà 5 número en comptes de 3.
		
		int a,b,c,d,e;
		int petit;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Programa per evaluar quin dels 3 valors indicats és el més petit");
		System.out.print("Digues 5 valors separats per un espai cada un: ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		e=scanner.nextInt();
		scanner.close();
		
		petit=a;
		if (b < petit)
			petit=b;
		if (c < petit)
			petit=c;
		if (d < petit)
			petit=d;
		if (e < petit)
			petit=e;
		System.out.println("El valor més petit és: "+petit);
		
	}

}
