package uf2_OOP_intro;

public class ex89 {
	/*
	89. Fer un programa on l�usuari anir� introduint n�meros, finalitzant la s�rie amb el 0. Per cada
	dos n�meros introdu�ts s�haur� de mostrar com a resultat si el segon n�mero es divisor del primer
	n�mero. Caldr� desenvolupar els seg�ents m�todes
	� int LlegirEnter();
	� boolean esDivisor(int Divisor, int Divident);
	*/	
	public static void main(String[] args) {
		ex89 programa = new ex89();
		programa.inici();
	}

	private void inici() {
		System.out.println("Programa que calcula divisors (0 per sortir)");
		int num1 = llegirEnter();
		int num2 = llegirEnter();
		boolean esDivisor=false;

		while (num1 != 0 && num2 != 0) {
			esDivisor = esDivisor(num1,num2);
			if (esDivisor == true) System.out.println(num1+" �s divisor de "+num2);
			else System.out.println(num1+" no �s divisor de "+num2);
			num1 = llegirEnter();
			num2 = llegirEnter();
		}
		System.out.println("Has sortit del programa");
	}

	private int llegirEnter() {
		cLector teclat = new cLector();
		int num1 = teclat.llegirEnter("Digues un numero.. ");
		return num1;
	}
	
	private boolean esDivisor(int divisor, int divident) {
		if (divident%divisor==0) return true;
		else return false;
	}
}