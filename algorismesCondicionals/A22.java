package algorismesCondicionals;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		
		/* 22. Demanar una nota numèrica (número real) i mostrar la nota que li correspon a l’alumne segons la següent escala de valors.
		- Si és major o igual que 9 i menor o igual que 10, la nota és d’“Excel·lent”.
		- Si és major i igual que 6.5 però estrictament menor que 9, la nota és “Notable”.
		- Si és major i igual que 5 però estrictament menor que 6.5, la nota és “Suficient”.
		- Si no és cap dels casos anteriors, la nota és de “Suspès”. */
		
		double nota;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues la teva nota númerica: ");
		nota=scanner.nextDouble();
		scanner.close();
		
		if (nota > 10 || nota < 0)
			System.out.println("La nota màxima ha de ser entre 0 i 10");
		else if (nota >= 9 && nota <= 10)
			System.out.println("Excel·lent");
		else if (nota >= 6.5)
			System.out.println("Notable");
		else if (nota >= 5)
			System.out.println("Suficient");
		else
			System.out.println("Suspès");
	}
}
