package algorismesIteratius;

import java.util.Scanner;

public class A31 {

	public static void main(String[] args) {
		/* 31. Visualitzar el seg�ent s�rie tants elements com l�usuari indiqui:
			1=2(+1)
			2=4(*2)
			3=4(+1)
			4=8(*2)
			5=6(+1)
			6=12(*2)
			... on si el n�mero a tractar �s parell s�ha de mostrar el doble d�ell mateix per� si es senarcaldr� mostrar el n�mero seg�ent. */
		
		int a=0,b=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Indica quants elements: ");
		a=scanner.nextInt();
		scanner.close();
		if (a==0)
			System.out.print("Escull un altre valor");
		while(a!=b) {
			b++;
			if((b%2)==0)
				System.out.println(b+"="+(b*2));
			else
				System.out.println(b+"="+(b+1));
		}
	}
}
