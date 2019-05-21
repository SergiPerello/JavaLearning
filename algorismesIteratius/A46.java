package algorismesIteratius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A46 {

	public static void main(String[] args) throws IOException {
		
		/* Ídem anterior però ara heu de dir el nombre de caràcters A, E, I, O, U,
		donant 5 resultats, un per cada vocal i tenint en compte que cal sumar tant majúscules com minúscules. */
		
		int cA=0,cE=0,cI=0,cO=0,cU=0;
		char cCaracter;
		int iCaracter;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		iCaracter = buffer.read();
		while(iCaracter != 13) {
			cCaracter = (char) iCaracter;
			if (cCaracter == 'a' || cCaracter == 'A') {
				cA++;
			}
			else if (cCaracter == 'e' || cCaracter == 'E') {
				cE++;
			}
			else if (cCaracter == 'i' || cCaracter == 'I') {
				cI++;
			}
			else if (cCaracter == 'o' || cCaracter == 'O') {
				cO++;
			}
			else if (cCaracter == 'u' || cCaracter == 'U') {
				cU++;
			}
            iCaracter = buffer.read();
        }
		System.out.println("A:"+cA);
		System.out.println("E:"+cE);
		System.out.println("I:"+cI);
		System.out.println("O:"+cO);
		System.out.println("U:"+cU);
	}

}
