package algorismesIteratius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A45 {
	public static void main(String[] args) throws IOException{
		/* 45.Fer un programa per entrar (caràcter a caràcter) un text (no buit) del que hem de dir el número de A’s que hi ha.
		El text s’acaba quan s’entri un Enter (Codi ASCII 13 en Windows, Codi ASCII 10 en Mac). */
		
		int contador=0;
		char cCaracter;
		int iCaracter;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		iCaracter = buffer.read();
		while(iCaracter != 13) {
			cCaracter = (char) iCaracter;
			if (cCaracter == 'a' || cCaracter == 'A') {
				contador++;
			}
            iCaracter = buffer.read();
        }
		System.out.println(contador);
	}
}
