package algorismesIteratius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A48 {

	public static void main(String[] args) throws IOException {
		int contadorLA=0,contadorSI=0;
		char cCaracter, char1=' ', char2=' ';
		int iCaracter;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriu una frase, indicarà el nombre de 'LA' que hi ha a la frase:");
		iCaracter = buffer.read();
		while(iCaracter != 13) {
			cCaracter = (char) iCaracter;
			char2=cCaracter;
			if ((char1 == 'l' || char1 == 'L')&&(char2 == 'a' || char2 == 'A')) {
				contadorLA++;
			}
			else if	((char1 == 's' || char1 == 'S')&&(char2 == 'i' || char2 == 'I')) {
				contadorSI++;
			}
			char1=char2;
            iCaracter = buffer.read();
        }
		System.out.println("Nombre de LA: "+contadorLA);
		System.out.println("Nombre de SI: "+contadorSI);
	}
}
