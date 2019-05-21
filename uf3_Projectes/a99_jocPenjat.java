package uf3_Projectes;

import java.util.Scanner;
import java.util.Arrays;

public class a99_jocPenjat {
	
	String word = "guacamole";
	
	public static void main(String[] args) {
		a99_jocPenjat program = new a99_jocPenjat();
		program.controller();
	}
	
	private void controller() {
		int wordLength = word.length();
		char[] baseWord = word.toCharArray();
		char[] finalWord = drawUnderscores(wordLength);
		char userChar = askCase();
		checkCase(wordLength, baseWord, finalWord ,userChar);
	}
	
	private char[] drawUnderscores(int wordLength) {
		char[] finalWord = new char[wordLength];
		for (int i=0;i<wordLength;i++)
			finalWord[i]= '_';
		return finalWord;
	}
	
	private char askCase() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriu una lletra: ");
		char userChar = sc.next().charAt(0);
		Character.toLowerCase(userChar);
		while (!Character.isLetter(userChar)) {
			System.out.print("ERROR, escriu una lletra: ");
			userChar = sc.next().charAt(0);
			Character.toLowerCase(userChar);
		}
		sc.close();
		return userChar;
	}
	
	private void checkCase(int wordLength, char[] baseWord, char[] finalWord, char userChar) {
        Boolean[] matches = new Boolean[wordLength];
        for (int i = 0; i < wordLength; i++)
            matches[i] = userChar == baseWord[i];
    }
}
/*
Dibuja una línea en blanco para cada letra de la palabra
Empieza a adivinar las palabras si eres el jugador
Completa la letra en el espacio en blanco si los jugadores adivinaron de forma correcta
Los jugadores ganan cuando adivinan la palabra correcta
*/