package algorismesIteratius;

import java.util.Scanner;

public class examen02 {

	public static void main(String[] args) {
		int valor, suma=0, mitjana, voltes=0, petit, gran;
		Scanner sc=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		valor=sc.nextInt();
		petit=valor;
		gran=valor;
		while (valor!=0) {
			suma=suma+valor;
			voltes++;
			if (valor<petit) petit=valor;
			if (valor>gran)	gran=valor;
			System.out.print("Digues un valor: ");
			valor=sc.nextInt();
		}
		sc.close();
		
		mitjana=suma/voltes;
		System.out.println("La suma de tots els n�meros �s: "+suma);
		System.out.println("La mitjana de tots els n�meros �s: "+mitjana);
		System.out.println("El valor m�s petit �s: "+petit);
		System.out.println("El valor m�s gran �s: "+gran);
	}
	
}