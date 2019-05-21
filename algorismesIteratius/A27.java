package algorismesIteratius;

public class A27 {

	public static void main(String[] args) {
		
		/* 27. Visualitzar el 20 primers nombres naturals amb els següents esquemes:
			35.a) Fer-ho amb l’estructura while {}
			35.b)	Fer-ho	amb	l’estructura	do	{}	while
			35.c)	Fer-ho	amb	l’estructura	for	{} */
		int valorWhile=0;
		int valorDoWhile=0;
		int valorFor=0;
		
		System.out.println("Fet amb while:");
		while (valorWhile<20){
			valorWhile++;
			System.out.print(valorWhile+" ");
		}
		
		System.out.println("\n"+"\n"+"Fet amb do while:");
		do {
			valorDoWhile++;
		     System.out.print(valorDoWhile+" ");
		} while (valorDoWhile<20);
		
		System.out.println("\n"+"\n"+"Fet amb for:");
		for(valorFor=1; valorFor<21; valorFor++){
            System.out.print(valorFor+" ");
       }
	}
}
