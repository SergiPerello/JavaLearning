package taulesBidimencionals;

import java.text.DecimalFormat;

public class A70 {
	/*
	70.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números de
	manera aleatòria, posteriorment buscar quin es el valor més gran i el més petit de cada fila,
	mostrant els 10 valors per pantalla. Mostrar la taula amb els números aleatoris en pantalla
	per poder fer comprovacions.
	*/
	private static int ROWS=10, COLS=10;
	public static void main(String[] args) {
		
		float[][]taula = new float [ROWS][COLS];
		float gran=0, petit=10;
		int n=0;
		DecimalFormat value = new DecimalFormat("#.#");
		
		for (int r = 0; r < ROWS ; r++) {	
			for (int c = 0; c < COLS;c++) {
				taula[r][c]=(float)(Math.random()*10);
				System.out.print(value.format(taula[r][c]) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int r = 0; r < ROWS;r++) {
			for (int c = 0;c < COLS;c++) {
				if (taula[r][c]>gran) gran=taula[r][c];
				if (taula[r][c]<petit) petit=taula[r][c];
			}
			n++;
			System.out.print("El gran de la fila "+n+" és: "+value.format(gran)+"\t");
			System.out.print("El petit de la fila "+n+" és: "+value.format(petit));
			System.out.println();
			gran=0;
			petit=10;
		}
		
	}

}
