package algorismesIteratius;

import java.util.Scanner;

public class A40 {

	public static void main(String[] args) {
		/*40. Visualitzar un quadrat de N asteriscs, sent N un valor entrat per teclat.
		Exemple per N= 5
		*	*	*	*	*
		*	*	*	*	*
		*	*	*	*	*
		*	*	*	*	*
		*	*	*	*	*
		*/
		
		int row,col;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		row = sc.nextInt();
		col=row;
		for (int i=0; i < row; i++) {
			for(int j=0; j < col; j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
