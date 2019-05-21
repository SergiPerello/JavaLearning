package algorismesCondicionals;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		
		/* 22. Demanar una nota num�rica (n�mero real) i mostrar la nota que li correspon a l�alumne segons la seg�ent escala de valors.
		- Si �s major o igual que 9 i menor o igual que 10, la nota �s d��Excel�lent�.
		- Si �s major i igual que 6.5 per� estrictament menor que 9, la nota �s �Notable�.
		- Si �s major i igual que 5 per� estrictament menor que 6.5, la nota �s �Suficient�.
		- Si no �s cap dels casos anteriors, la nota �s de �Susp�s�. */
		
		double nota;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues la teva nota n�merica: ");
		nota=scanner.nextDouble();
		scanner.close();
		
		if (nota > 10 || nota < 0)
			System.out.println("La nota m�xima ha de ser entre 0 i 10");
		else if (nota >= 9 && nota <= 10)
			System.out.println("Excel�lent");
		else if (nota >= 6.5)
			System.out.println("Notable");
		else if (nota >= 5)
			System.out.println("Suficient");
		else
			System.out.println("Susp�s");
	}
}
