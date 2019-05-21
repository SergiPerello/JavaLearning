package algorismesIteratius;

import java.util.Scanner;

public class A30 {

	public static void main(String[] args) {
		/* 30. L’usuari introduirà un número i es mostrarà la següent seqüència en pantalla: n = n*2 */
		int n=0,a=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor a multiplicar: ");
		n=scanner.nextInt();
		scanner.close();
		
		while(n != a) {
			a++;
			System.out.println(a+"="+a*2);
		}
	}
}
