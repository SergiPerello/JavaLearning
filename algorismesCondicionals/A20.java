package algorismesCondicionals;

import java.util.Scanner;

public class A20 {

	public static void main(String[] args) {
		
		// 20. L�usuari introduir� 3 n�meros. Una vegada llegits caldr� mostrar en pantalla quin �s el m�s petit dels 3.
		
		int a,b,c;
		int petit;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Programa per evaluar quin dels 3 valors indicats �s el m�s petit");
		System.out.print("Digues el primer valor: ");
		a=scanner.nextInt();
		System.out.print("Digues el segon valor: ");
		b=scanner.nextInt();
		System.out.print("Digues el tercer valor: ");
		c=scanner.nextInt();
		scanner.close();
		
		petit=a;
		if (b < petit)
			petit=b;
		if (c < petit)
			petit=c;
		System.out.println("El valor m�s petit �s: "+petit);
	}

}
