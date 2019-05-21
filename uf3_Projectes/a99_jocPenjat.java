package uf3_Projectes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class a99_jocPenjat {
	
	String word = "llapis";
	
	public static void main(String[] args) {
		a99_jocPenjat program = new a99_jocPenjat();
		program.controller();
	}
	
	private void controller() {
		ArrayList<Integer> positions = new ArrayList<Integer>();
		int wordLength = word.length();
		char[] finalWord = drawUnderscores(wordLength);
		char userChar = askCase();
		positions = checkChar(userChar, wordLength);
		
		if (positions.size()!=0) {
			finalWord = replaceChar(positions, finalWord, userChar);
			System.out.println(finalWord);
		}
		else System.out.println("Error, el char no esta al string");
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
	
	private char[] replaceChar(ArrayList<Integer> positions, char[] finalWord, char userChar) {
		int currentPosition;
		int positionsSize = positions.size();
		for (int i=0;i<positionsSize;i++) {
			currentPosition = positions.get(i);
			finalWord[currentPosition] = userChar;
		}
		return finalWord;
	}
}
/*
Dibuja una línea en blanco para cada letra de la palabra
Empieza a adivinar las palabras si eres el jugador
Completa la letra en el espacio en blanco si los jugadores adivinaron de forma correcta
Los jugadores ganan cuando adivinan la palabra correcta
*/