package uf2_OOP_intro;

public class ex90 {
	/*
	90. Fer un programa on l�usuari anir� introduint n�meros, finalitzant la s�rie amb el 0. Tots els
	n�meros s�aniran guardant en una taula i al final caldr� donar com a resultat, el n�mero m�s gran
	de la s�rie, el n�mero m�s petit, la mitjana i quants son m�s grans que la mitjana. Caldr�
	desenvolupar els seg�ents m�todes
	� int Llegirenter();
	� int mesGran(int[] valors);
	� int mesPetit(int[] valors);
	� double mitjana(int[] valors);
	*/
	private static int T = 5;
	public static void main(String[] args) {
		ex90 programa = new ex90();
		programa.controller();
	}

	private void controller() {
		int taula[] = new int [T];
		int z_checker;
		for (int i=0;i<T;i++) {
			do z_checker = llegirEnter();
			while (z_checker != 0);
			taula[i] = z_checker;
		}
	}
	
	private int llegirEnter() {
		cLector sc = new cLector();
		int num1 = sc.llegirEnter("Digues un numero.. ");
		return num1;
	}
	/*
	private int mesGran(int[] valors) {
		
	}
	
	private int mesPetit(int[] valors) {
		
	}
	
	private double mitjana(int[] valors) {
		
	}
	*/

}
