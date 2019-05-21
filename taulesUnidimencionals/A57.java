package taulesUnidimencionals;

import java.util.Scanner;

public class A57 {
	
	private static int TAMANY=10;
	public static void main(String[] args) {
		/*
		L�usuari anir� introduint valors fins que entri el -999 que vol dir que l�usuari no vol introduir m�s
		n�mero, el valor -999 no es tractar�. Cada numero s�anir� incorporant en una taula sempre i
		quan el n�mero no s�hagi dit anteriorment, si aix� passa el n�mero no s�introduir� a la taula.
		Una vegada l�usuari hagi finalitzat d�introduir n�meros caldr� buscar el valor m�xim, i el lloc on
		es troba aquest valor, mostrant aquestes dues informacions per pantalla.
		*/
		int []taula=new int [TAMANY];
		int valor=0,index=0,properalliure=0,max=taula[0],var=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entra valors,escriu (-999) per aturar-ho:");
		valor = sc.nextInt();
		
		while ((properalliure < TAMANY) && (valor != -999)) {
			while((valor != taula[index]) && (index < properalliure)) index++;
			if (index<properalliure) System.out.println("Valor ja existent a la taula");
			else {
				taula[properalliure]=valor;
				properalliure++;
			}
			valor=sc.nextInt();
		}
		sc.close();
		for (index=0;index<properalliure;index++) {
			if (taula[index]>max) {
				max=taula[index];
				var=index++;
			}
		}
		System.out.println("El n�mero m�xim �s " + max + " i est� en la posici� " + (var+1));
	}

}
		