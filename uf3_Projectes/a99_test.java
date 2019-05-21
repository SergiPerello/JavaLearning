package uf3_Projectes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a99_test {
	
	String word = "a a";
	
	public static void main(String[] args) {
		a99_test program = new a99_test();
		program.controller();
	}
	
	private void controller() {
		int wordLength = word.length();
		char[] finalWord = drawUnderscores(wordLength);
		char userChar = askCase();
		ArrayList<Integer> positions = checkChar(userChar,wordLength);
		fillArray(positions, finalWord);
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
	
	private ArrayList<Integer> checkChar(char userChar, int wordLength) {
		ArrayList<Integer> positions = new ArrayList<Integer>();
		int currentPosition = 0;
		while (currentPosition != -1 && currentPosition < wordLength) {
			currentPosition = word.indexOf(userChar, currentPosition);
		    if (currentPosition != -1) {
		    	positions.add(currentPosition);
			    currentPosition++;
		    }
		}
		return positions;
    }
	
	private void fillArray(ArrayList<Integer> positions, char[] finalWord) {
		for(int i=0;i<positions.size();i++) System.out.println(positions.get(i));
	}
}
/*
Dibuja una línea en blanco para cada letra de la palabra
Empieza a adivinar las palabras si eres el jugador
Completa la letra en el espacio en blanco si los jugadores adivinaron de forma correcta
Los jugadores ganan cuando adivinan la palabra correcta
*/