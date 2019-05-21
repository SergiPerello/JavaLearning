package taulesUnidimencionals;

import java.util.Scanner;

public class A58 {
	
	private static int TAMANY=10;
	public static void main(String[] args) {
		/*
		L�usuari introduir� valors reals que signifiquen temperatures d�una ciutat. Aquestes
		temperatures les anirem introduint en una taula validant que si la temperatura est� per sota de -
		40 o per sobre de 60 no son correctes, mostrant un missatge d�error i no introduint aquestes
		temperatures en la taula.
		Per finalitzar l�usuari posar� la temperatura -999 que no es tractar�.
		Una vegada es tinguin totes les temperatures caldr� mostrar quina es la mitjana de les
		temperatures i la relaci� de temperatures m�s grans que la mitjana.
		*/
		float []taula=new float [TAMANY];
		float temperature=0,suma=0;
		int index=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entra valors,escriu (-999) per aturar-ho:");
		temperature = sc.nextFloat();
		while ((index < TAMANY)&&(temperature != -999)) {
			if ((temperature<(-40))||(temperature>60)) System.out.println("Error");
			else taula[index]=temperature;
			if (index != (TAMANY-1)) temperature=sc.nextFloat();
			index++;
		}
		sc.close();
		
		for (int i=0;i<TAMANY;i++) suma+=taula[i];
		float mitjana=suma/index;
		System.out.println("La mitjana �s: "+mitjana);
		System.out.print("Els valors per sobre de la mitjana s�n: ");
		for (int i=0;i<TAMANY;i++) if (taula[i]>mitjana) System.out.print(taula[i]+" ");
	}
}


