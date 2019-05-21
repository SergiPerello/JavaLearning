package algorismesIteratius;

import java.util.Scanner;

public class A42 {

	public static void main(String[] args) {
		/* 42. Fer un programa que imprimeixi una figura semblant a la representada a continuació havent llegit un número N per teclat. Per exemple N = 4
		   
		   *
		  ***
		 *****
		*******                    */
		
		int row=0,col=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Digues un valor: ");
		row = sc.nextInt();
		int spaces=row-1;
		for (int i=0; i < row; i++) {
			for(int k=0; k < spaces; k++) System.out.print(" ");
			for(int j=0;j < col; j++) System.out.print("*");
			spaces--;
			col=col+2;
			System.out.print("\n");
		}
		sc.close();
	}
}
