package algorismesIteratius;

import java.util.Scanner;

public class A29 {

	public static void main(String[] args) {
		/* 29. Introduir dos números, n i m i fer la taula del 1 al n del número m. */
		
		int a=0,n,m;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues fins quin numero arribarà la taula multiplicar: ");
		n=scanner.nextInt();
		
		System.out.print("Digues amb quin numero: ");
		m=scanner.nextInt();
		scanner.close();
		while(n != a) {
			a++;
			System.out.println(a+"*"+m+"="+a*m);
		}
	}
}
