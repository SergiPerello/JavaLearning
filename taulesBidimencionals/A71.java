package taulesBidimencionals;

public class A71 {
	/*
	71.Fer un algoritme per transposar una matriu de 10x10 omplerta amb números aleatoris.
	Caldrà mostrar la matriu original i la matriu trasposada.
	https://es.wikipedia.org/wiki/Matriz_transpuesta
	*/
	private static int ROWS=10, COLS=10;
	public static void main(String[] args) {
		
		int[][]table0 = new int [ROWS][COLS];
		int[][]table1 = new int [ROWS][COLS];
		
		for (int r=0;r<ROWS;r++) {	
			for (int c=0;c<COLS;c++) {
				table0[r][c]=(int)(Math.random()*10);
				System.out.print(table0[r][c]+" ");
			} System.out.println();
			
		} System.out.println();
		for (int r=0;r<ROWS;r++) {
			for (int c=0;c<COLS;c++) {
				table1[r][c]=table0[c][r];
			}
		}
		for (int r=0;r<ROWS;r++) {
			for (int c=0;c<COLS;c++) {
				table0[r][c]=table1[r][c];
				System.out.print(table0[r][c]+" ");
			} System.out.println();
		}
	}

}
