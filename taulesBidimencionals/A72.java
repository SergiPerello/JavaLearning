package taulesBidimencionals;

public class A72 {
	/*
	72.Fer un algoritme que sumi dues matrius i mostri el resultat per pantalla.
	Les dues matrius s’ompliran amb números aleatoris.
	Caldrà mostrar les dues matrius originals y la matriu suma.
	https://ca.wikipedia.org/wiki/Matriu_(matem%C3%A0tiques)#Suma
	*/
	private static int ROWS=10, COLS=10; //array's size
	public static void main(String[] args) {
		
		int[][]table0 = new int [ROWS][COLS]; //array table0
		int[][]table1 = new int [ROWS][COLS]; //array table1
		
		System.out.println("Table0\t\t\tTable1\t\t\tTable0+Table1"); //improves UX
		
		for (int r=0;r<ROWS;r++) {	
			for (int c=0;c<COLS;c++) {
				table0[r][c]=(int)(Math.random()*4); //fill table0 with random nums
				table1[r][c]=(int)(Math.random()*4); //fill table1 with random nums
				System.out.print(table0[r][c]+" "); //prints 1 table0 row for each loop
			} System.out.print("\t"); //tab
			for (int c=0;c<COLS;c++) {
				System.out.print(table1[r][c]+" "); //prints 1 table1 row for each loop
			} System.out.print("\t"); //tab
			for (int c=0;c<COLS;c++) {
				table0[r][c]+=table1[r][c]; //table0 + table1 = table0(overwritten)
				System.out.print(table0[r][c]+" "); //prints 1 result row for each loop
			} System.out.println(); //enter to next line
		}
	}

}
