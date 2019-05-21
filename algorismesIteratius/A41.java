package algorismesIteratius;

import java.util.Scanner;

public class A41 {

	public static void main(String[] args) {
		
		/* 41. Fer un algorisme que escrigui el triangle de Floyd.
		Inicialment llegirem un número N enter que representarà el número de files a escriure.
		Exemple per N=4
		1
		2  3
		4  5  6
		7  8  9  10
		*/
		int row=0,col=1;
		int valorPrint=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		row = sc.nextInt();
		for (int i=0; i < row; i++) {
			for(int j=0;j < col; j++) {
				System.out.print(valorPrint+++" ");
			}
			col++;
			System.out.print("\n");
		}
		sc.close();
	}
}
