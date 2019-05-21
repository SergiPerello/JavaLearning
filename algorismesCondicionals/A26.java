package algorismesCondicionals;

import java.util.Scanner;

public class A26 {

	public static void main(String[] args) {
		
		/* 26. Determinar la quantitat de diners que rebrà un treballador en concepte de les
		hores extres treballades en una empresa, sabent que quan les hores de treball
		excedeixen de 40, la resta es consideren hores extres i que aquestes es paguen al
		doble d'una hora normal.
		Si el treballador fa més de 8 hores extres, la novena i posteriores hores es paguen
		al triple del preu d’una hora normal.
		Exemples partint de la premis que l’usuari hagi informat que el preu hora del
		treballador es paguen a 8€.
		Si l’usuari indica 50 hores treballades el programa haurà de mostrar els següents resultats.
		8 hores extres al doble: 128€
		2 hores extres al triple: 28€
		Total a pagar: 156€
		Si l’usuari indica 46 hores treballades el programa haurà de mostrar els següents resulats.
		6 hores extres al doble: 96€
		Total a pagar: 96€ */
		
		int hores;
		int horesDobles;
		int horesTriples;
		int preuHora;
		int souDoble;
		int souTriple;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues la quantitat de hores treballades: ");
		hores=scanner.nextInt();
		if (hores <= 40)
			System.out.println("No has treballat hores extres");
		else {
			System.out.print("Digues el preu per hora: ");
			preuHora=scanner.nextInt();
			if (hores > 48) {
				horesTriples=hores-48;
				horesDobles=hores-40-horesTriples;
				souDoble=horesDobles*(preuHora*2);
				souTriple=horesTriples*(preuHora*3);
				System.out.println(horesDobles+" hores extres al doble: "+souDoble+"€");
				System.out.println(horesTriples+" hores extres al triple: "+souTriple+"€");
				System.out.println("Total a pagar: "+(souDoble+souTriple)+"€");
			}
			else {
				horesDobles=hores-40;
				souDoble=horesDobles*(preuHora*2);
				System.out.println(horesDobles+" hores extres al doble: "+souDoble+"€");
				System.out.println("Total a pagar: "+(souDoble)+"€");
			}	
		}
		scanner.close();
	}
}