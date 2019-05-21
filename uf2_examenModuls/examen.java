package uf2_examenModuls;

import java.util.Scanner;

public class examen {
	int MAX = 3;
	
	public static void main(String[] args) {
		examen programa = new examen();
		programa.controller();
	}
	
	private void controller() {
		int[] taulaUni = new int[MAX];
		float[][] taulaBi = new float[MAX][MAX];
		int numero;
		boolean end = false;
		int lliure=0;
		int opcio;
		while (end == false) {
			opcio = menu();
			switch(opcio) {
			case 1:
				System.out.print("Has selecionat inserir un numero. ");
				numero = askNumber();
				lliure = exercici01(taulaUni,lliure,numero);
			break;
			case 2:
				System.out.print("Has selecionat mostrar la taula. ");
				mostrarTaula(taulaUni,lliure);
			break;
			case 3:
				System.out.print("Has selecionat buscar la mitjana. ");
				if (lliure == 0) System.out.println("La taula esta buida!");
				else {
					numero = askNumber();
					float mitjana = exercici03(taulaUni,lliure,numero);
					System.out.print("La mitjana és: "+mitjana);
				}
			break;
			case 4:
				taulaBi = askNumberBi(taulaBi);
				exercici02(taulaBi);
				mostrarTaulaBi(taulaBi);
			break;
			case 5:
				end = true;
				System.out.println("Has sortit del programa");
			break;
			}
		}
		
	}
	
	private int menu() {
		int opcio;
		System.out.println("-----------------------------------\n"+
							"Quina acció vols realitzar:\n"+
							"1- Inserir numero\n"+
							"2- Mostrar taula\n"+
							"3- Buscar mitjana\n"+
							"4- Trasposada\n"+
							"5- Tancar programa");
		opcio = askNumber();
		return opcio;
	}
	
	private int askNumber() {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Digues el numero: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No es un enter. Escriu un enter: ");
		}
		numero = sc.nextInt();
		return numero;
	}
	
	private float[][] askNumberBi(float[][] taulaBi) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<MAX-1;i++) {
			for (int j=0;i<MAX-1;j++) {
				System.out.print("Valor de la posició "+i+"-"+j+": ");
				taulaBi[i][j]=askNumber();
			}
		}
		return taulaBi;
	}
	
	private void mostrarTaula(int[] taulaUni, int lliure) {
		if (lliure == 0) System.out.println("La taula esta buida!");
		else {
			for (int i=0;i<lliure;i++) {
				System.out.print(taulaUni[i]+" ");
			}
			System.out.println();
		}
	}
	
	private void mostrarTaulaBi(float[][] taulaBi) {
		for (int i=0;i<MAX;i++) {
			for (int j=0;i<MAX;j++) {
				System.out.print(taulaBi[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private int exercici01(int[] taulaUni, int lliure, int numero) {
		boolean found = false;
		for (int i=0;i<MAX;i++) {
			if (numero == taulaUni[i]) {
				found = true;
				System.out.println("Aquest numero ja existeix a la taula");
			}
		}
		if (found == false) {
			taulaUni[lliure] = numero;
			lliure++;
		}
		return lliure;
	}
	
	private float[][] exercici02(float[][] taulaBi) {
		float[][] auxiliar = new float [MAX][MAX];
		for (int i=0;i<MAX;i++) {
			for (int j=0;j<MAX;j++) {
				auxiliar[i][j]=taulaBi[i][j];
			}
		}
		for (int i=0;i<MAX;i++) {
			for (int j=0;j<MAX;j++) {
				taulaBi[i][j]=auxiliar[j][i];
			}
		}
		return taulaBi;
	}
	
	private float exercici03(int[]taulaUni, int lliure, int numero) {
		int suma=0;
		float mitjana=0;
		if (lliure == 0) System.out.println("La taula esta buida!");
		else {
			for (int i=0;i<lliure;i++) {
				if (taulaUni[i]>numero)
					suma += taulaUni[i];
			}
			mitjana = suma/lliure;
		}
		return mitjana;
	}

}