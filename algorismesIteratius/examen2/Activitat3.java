package algorismesIteratius.examen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activitat3 {

	public static void main(String[] args) throws IOException {
		int contador1=0,contador2=0;
		char cCaracter, char1=' ', char2=' ';
		int iCaracter;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriu una frase:");
		iCaracter = buffer.read();
		char1 = (char) iCaracter;
		contador1++;
		iCaracter = buffer.read();
		char2 = (char) iCaracter;
		contador2++;
		iCaracter = buffer.read();
		while(iCaracter != 13) {
			cCaracter = (char) iCaracter;
			if (cCaracter == char1)	contador1++;
			else if	(cCaracter == char2) contador2++;
            iCaracter = buffer.read();
        }
		System.out.println("La lletra "+char1+" està "+contador1+" vegades");
		System.out.println("La lletra "+char2+" està "+contador2+" vegades");
	}

}
