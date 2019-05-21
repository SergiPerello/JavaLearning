package algorismesIteratius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A47 {

	public static void main(String[] args) throws IOException {
		/* Fer un programa per entrar (caràcter a caràcter) un text (no buit) del que hem de dir el número de la
		seqüencia ‘LA’que hi ha. El text s’acaba quan s’entri un Enter (Codi ASCII 13 en Windows, Codi ASCII 10 en Mac).
		Exemple, si l’usuari entra la frase ‘La abeja Adela esta en el panel a del huerto’ Donarà com a resultat 2 */
		
		int contador=0;
		char cCaracter, char1=' ', char2=' ';
		int iCaracter;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriu una frase, indicarà el nombre de 'LA' que hi ha a la frase:");
		iCaracter = buffer.read();
		while(iCaracter != 13) {
			cCaracter = (char) iCaracter;
			char2=cCaracter;
			if ((char1 == 'l' || char1 == 'L')&&(char2 == 'a' || char2 == 'A')) {
				contador++;
			}
			char1=char2;
            iCaracter = buffer.read();
        }
		System.out.println("Nombre de LA"+contador);
		
	}

}
