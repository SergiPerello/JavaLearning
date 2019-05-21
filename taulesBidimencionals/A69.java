package taulesBidimencionals;

public class A69 {
	/*
	69.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números de
	manera aleatòria, posteriorment calcular la suma de cada fila i la suma de cada columna
	mostrant els 20 resultats per pantalla. Mostrar la taula amb els números aleatoris en pantalla
	per poder fer comprovacions.
	*/
	private static int ROWS=10, COLS=10;
	public static void main(String[] args) {
		
		int[][]taula = new int [ROWS][COLS];
		int s_rows = 0, s_cols = 0, n = 0;
		
		for (int a = 0; a < ROWS;a++) {
			for (int b = 0;b < COLS;b++) taula[a][b]=(int)(Math.random()*10);
		}
		for (int a = 0; a < ROWS ; a++) {	
			for (int b = 0; b < COLS;b++) System.out.print(taula[a][b] + " ");
			System.out.println();
		}
		
		for (int a = 0; a < ROWS;a++) {
			for (int b = 0;b < COLS;b++) {
				s_rows += taula[a][b];
				s_cols += taula[b][a];
			}
			n++;
			System.out.print("Fila "+n+": ");
			System.out.println(s_rows);
			s_rows = 0;
			System.out.print("Columna "+n+": ");
			System.out.println(s_cols);
			s_cols = 0;
		}
	}
}
