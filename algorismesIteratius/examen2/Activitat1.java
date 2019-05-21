package algorismesIteratius.examen2;

import java.util.Scanner;

public class Activitat1 {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Digues el primer valor:");
		int num1=sc.nextInt();
		int b=0;
		for (int i=1;i<num1;i++) {
			int a = num1%i;
			for (int j=1;j<=i;j++) {
				if (i%j==0)
					b++;
				}
			System.out.println (i);
		}
	}

}
