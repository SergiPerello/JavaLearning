package algorismesIteratius;

import java.util.Scanner;

public class A37 {

	public static void main(String[] args) {
		/* 37. L�usuari introduir� tants n�meros com vulgui i caldr� mostrar quin �s el valor m�s gran, el m�s petit i la mitjana dels valors que l�usuari a introdu�t.
		L�usuari posar� el n�mero 0 quan ja no vulgui introduir m�s n�meros no formant part de la seq�encia de n�meros aquest n�mero 0. */
		
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
			System.out.println("El valor m�s gran �s el: "+gran);
			System.out.println("El valor m�s petit �s el: "+petit);
			System.out.println("La mitjana �s: "+(double)suma/voltes);	
		}
		scanner.close();
	}

}
