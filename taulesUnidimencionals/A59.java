package taulesUnidimencionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A59 {
	
	private static int TAMANY=26;
	public static void main(String[] args) throws IOException {
		/*
		Un usuari introduirà una frase per pantalla i quan finalitzi caldrà dir quantes vegades ha introduït
		cada una de les lletres de l ‘abecedari (‘a’-‘z’). Es recomana crear una taula de 27 posicions
		d’enters que seran els 27 comptadors que fan falta. Tenir present que un caràcter es pot
		convertir al seu número ASCII.
		*/
		int []taula=new int [TAMANY];
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int iCaracter;
		int dif=0;
		boolean error=false;
		iCaracter = buffer.read();
		iCaracter = Character.toLowerCase(iCaracter);
		while(iCaracter != 13 && error==false) {
			dif=iCaracter-97;
			if (dif>=0 && dif<=25) {
				error=false;
				taula[dif]++;
	            iCaracter = buffer.read();
	            iCaracter = Character.toLowerCase(iCaracter);
			}
			else error=true;
        }
		//97 es a, 122 es z
		if (error==true) System.out.println("Introdueix nomes lletres");
		else {
			System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
			for (int i=0;i<TAMANY;i++) System.out.print(taula[i]+" ");
		}
	}
}