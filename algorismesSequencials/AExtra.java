package algorismesSequencials;

import java.util.Scanner;

public class AExtra {

	public static void main(String[] args) {
		
		double valorProducte=0;
		double valorEntregat=0;
		double valorDescomptat=0;
		int moneda=0;
		int residu=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digues el valor del producte: ");
		valorProducte=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Digues el valor introduït: ");
		valorEntregat=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		
		valorProducte=valorProducte*100;
		valorEntregat=valorEntregat*100;
		
		valorDescomptat=valorEntregat-valorProducte;

		moneda=(int)valorDescomptat/200;
		residu=(int)valorDescomptat%200;
		System.out.println("---------------------------------");
		System.out.println("El canvi és: "+valorDescomptat/100+"€");
		System.out.println("---------------------------------");
		System.out.println(moneda+" monedes de 2€");
		
		
		moneda=residu/100;
		residu=residu%100;
		System.out.println(moneda+" monedes de 1€");
		
		moneda=residu/50;
		residu=residu%50;
		System.out.println(moneda+" monedes de 0.50€");
		
		moneda=residu/20;
		residu=residu%20;
		System.out.println(moneda+" monedes de 0.20€");
		
		moneda=residu/10;
		residu=residu%10;
		System.out.println(moneda+" monedes de 0.10€");
		
		moneda=residu/5;
		residu=residu%5;
		System.out.println(moneda+" monedes de 0.05€");
		
		moneda=residu/2;
		residu=residu%2;
		System.out.println(moneda+" monedes de 0.02€");
		
		moneda=residu/1;
		residu=residu%1;
		System.out.println(moneda+" monedes de 0.01€");
	}

}
