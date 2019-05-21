package algorismesCondicionals;

import java.util.Scanner;

public class A20 {

	public static void main(String[] args) {
		
		// 20. L’usuari introduirà 3 números. Una vegada llegits caldrà mostrar en pantalla quin és el més petit dels 3.
		
		int a,b,c;
		int petit;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Programa per evaluar quin dels 3 valors indicats és el més petit");
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
		System.out.println("El valor més petit és: "+petit);
	}

}
