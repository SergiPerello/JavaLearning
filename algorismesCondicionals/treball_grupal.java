package algorismesCondicionals;

import java.util.Scanner;

public class treball_grupal {

	public static void main(String[] args) {
		
		/* Fes un algoritme que gestioni de manera eficient un sistema de 3 ascensors en una distribució
		 * de 10 pisos depenent dels usuaris i de el pis en el que es trobi l’ascensor en questió.
		 * Per exemple, si l’ascensor 1 es troba a la planta 9, l’ascensor 2 es troba a la planta 1
		 * i l’ascensor 3 a la planta 3, un usuari que es troba a la planta 7 i demana un ascensor
		 * es prioritzara el de la planta més pròxima (en aquest cas l’ascensor numero 1), tot i que també
		 * ha de considerar els altres usuaris que hagin demanat un ascensor.
		 */
		
		//Inicialitació de variables
		int ascensor1 = 0;
		int ascensor2 = 0;
		int ascensor3 = 0;
		int usuari=0;
		int aprop; //Determina la distancia entre la posició de l'ascensor i el client
		int who; //Determina l'ascensor que atendrà al client
		
		//Explicació del programa a l'usuari i determinació de la posició de l'usuari
		Scanner scanner=new Scanner(System.in);
		System.out.println("Programa que determina quin dels 3 ascensors atendrà a l'usuari segons la seva posició i la posició dels ascensors al llarg de les 10 plantes de l'edifici");
		System.out.print("Digues la posició del usuari: ");
		usuari=scanner.nextInt();
		scanner.close();
		
		//Posició aleatoria dels ascensors, amb un nombre entre el 0 i el 10
		ascensor1=(int) (Math.random() * 10);
		ascensor2=(int) (Math.random() * 10);
		ascensor3=(int) (Math.random() * 10);
		
		//Informar a l'usuari la posició dels ascensors
		System.out.println("Posició ascensor1: "+ascensor1);
		System.out.println("Posició ascensor2: "+ascensor2);
		System.out.println("Posició ascensor3: "+ascensor3);
		
		//Determinar la diferencia entre l'usuari i l'ascensor
		ascensor1=usuari-ascensor1;
		ascensor2=usuari-ascensor2;
		ascensor3=usuari-ascensor3;
		
		//Comprovació si la resta anterior dona negatiu, si és que si, eliminem el simbol negatiu
		if (ascensor1 < 0) ascensor1=Math.abs(ascensor1);
		if (ascensor2 < 0) ascensor2=Math.abs(ascensor2);
		if (ascensor3 < 0) ascensor3=Math.abs(ascensor3);
		
		//Comprovar quin ascensor esta més aprop del usuari, i informar quin ascensor vindrà.
		aprop=ascensor1;
		who=1;
		if (aprop > ascensor2) {
			aprop=ascensor2;
			who=2;
		}
		if (aprop > ascensor3) {
			aprop=ascensor3;
			who=3;
		}
		//Missatge de impressió per pantalla
		System.out.println("L'ascensor que arribarà és el "+who+" que està a "+aprop+" plantes del client");
	}

}
