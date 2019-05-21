package algorismesIteratius;

import java.util.Scanner;

public class A39a {

	public static void main(String[] args) {
		/* 39. Calcular el factorial d’ un nombre demanat per teclat. Exemple, si l’usuari entra el número 5 el resultat en pantalla serà. 120
		Recordar que el factorial es multiplicar el número per tots els números anteriors a ell fins a la unitat, és a dir, el factorial de 5 és 5*4*3*2*1 */
		
		int value;
		int resultat;
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("De quin valor vols saber el seu factorial: ");
		value=scanner.nextInt();
		
		resultat=value;
		for (int i=resultat-1;i>1;i--) {
			resultat=resultat*i;
		}
		
		System.out.print("El factorial és: "+resultat);
		scanner.close();
		
	}

}
