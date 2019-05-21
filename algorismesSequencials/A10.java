package algorismesSequencials;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		
		int diners=0;
		int resultat5=0, resultat10=0, resultat20=0, resultat50=0, resultat100=0;
		int residu5=0, residu10=0, residu20=0, residu50, residu100;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el nombre de diners: ");
		diners=scanner.nextInt();
		scanner.close();
		
		resultat5=diners/5;
		residu5=diners % 5;
		
		resultat10=diners/10;
		residu10=diners % 10;
		
		resultat20=diners/20;
		residu20=diners % 20;
		
		resultat50=diners/50;
		residu50=diners % 50;
		
		resultat100=diners/100;
		residu100=diners % 100;
		
		System.out.println("Bitllet 5: "+resultat5+" bitllets i sobren "+residu5+"€");
		System.out.println("Bitllet 10: "+resultat10+" bitllets i sobren "+residu10+"€");
		System.out.println("Bitllet 20: "+resultat20+" bitllets i sobren "+residu20+"€");
		System.out.println("Bitllet 50: "+resultat50+" bitllets i sobren "+residu50+"€");
		System.out.println("Bitllet 100: "+resultat100+" bitllets i sobren "+residu100+"€");

	}

}
