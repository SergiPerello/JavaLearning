package algorismesIteratius;

import java.util.Scanner;

public class A37 {

	public static void main(String[] args) {
		/* 37. L’usuari introduirà tants números com vulgui i caldrà mostrar quin és el valor més gran, el més petit i la mitjana dels valors que l’usuari a introduït.
		L’usuari posarà el número 0 quan ja no vulgui introduir més números no formant part de la seqüencia de números aquest número 0. */
		
		int valor,gran,petit;
		int suma=0;
		int voltes=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Digues un valor: ");
		valor=scanner.nextInt();
		gran=valor;
		petit=valor;
		if (valor==0)
			System.out.print("Has sortit del programa");
		else {
			gran=valor;
			petit=valor;
			while(valor!=0) {
				if(valor>gran) gran=valor;
				if(valor<petit) petit=valor;
				suma=suma+valor;
				voltes++;
				System.out.print("Digues un altre valor: ");
				valor=scanner.nextInt();
			}
			System.out.println("El valor més gran és el: "+gran);
			System.out.println("El valor més petit és el: "+petit);
			System.out.println("La mitjana és: "+(double)suma/voltes);	
		}
		scanner.close();
	}

}
