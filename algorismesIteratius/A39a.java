package algorismesIteratius;

import java.util.Scanner;

public class A39a {

	public static void main(String[] args) {
		/* 39. Calcular el factorial d� un nombre demanat per teclat. Exemple, si l�usuari entra el n�mero 5 el resultat en pantalla ser�. 120
		Recordar que el factorial es multiplicar el n�mero per tots els n�meros anteriors a ell fins a la unitat, �s a dir, el factorial de 5 �s 5*4*3*2*1 */
		
		int value;
		int resultat;
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("De quin valor vols saber el seu factorial: ");
		value=scanner.nextInt();
		
		resultat=value;
		for (int i=resultat-1;i>1;i--) {
			resultat=resultat*i;
		}
		
		System.out.print("El factorial �s: "+resultat);
		scanner.close();
		
	}

}
