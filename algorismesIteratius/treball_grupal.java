package algorismesIteratius;

import java.util.Scanner;

/**
 * 
 * @author Guillem
 * @author Eduard 
 * @author Sergi
 * 
 */

/*
3 en ratlla
Programa en el que es genera un tauler de 9 caselles (3x3) basat en 9 números:
		╔═══╦═══╦═══╗
		║ 1 ║ 2 ║ 3 ║
		╠═══╬═══╬═══╣
		║ 4 ║ 5 ║ 6 ║
		╠═══╬═══╬═══╣
		║ 7 ║ 8 ║ 9 ║
		╚═══╩═══╩═══╝
Primer el PC genera un número aleatori entre els 9 números i seguidament l’usuari pot introduir un número per col·locar les fitxes.
L’usuari anirà introduint números fins que els 9 estiguin complets (for 9), un cop completar el tauler, es col·locaran les variables
de les posicions de les fitxes a 0. I s’indicarà el guanyador de la partida o si ha sigut empat. Un cop acabada la partida, es pregunta a l’usuari si vol fer una altra partida (no = 0, sí = 1).
Si sobra temps dibuixem el tauler amb asteriscs (caràcters ASCII).
*/

public class treball_grupal {
    
	private static char [][] taula= {{0,0,0},{0,0,0},{0,0,0}};
    private static int dificultat;
    private static boolean fi=false;
    static Scanner teclat = new Scanner(System.in);
    private static int draw=0;
    private static int lose=0;
    private static int win=0;
    public static void main (String [] args) {
    	/*
    	 * Per tira has de posa un numero entre l'1 i el 9,aquest indica la casella on vols tirar
    	 * ╔═══╦═══╦═══╗
		 * ║ 1 ║ 2 ║ 3 ║
		 * ╠═══╬═══╬═══╣
		 * ║ 4 ║ 5 ║ 6 ║
		 * ╠═══╬═══╬═══╣
		 * ║ 7 ║ 8 ║ 9 ║
		 * ╚═══╩═══╩═══╝
    	 * */
	    System.out.println("Benvingut al 3 en ratlla");
	    
	  //una funcio on es tria la dificultat
	    dificultat();
	    //Si es dificultat 1 va a la funcio jugarD1 si no jugarD2
    	if(dificultat==1) {jugarD1();}
    	else if(dificultat==2) {jugarD2();}
    	else if(dificultat==3) {jugarD3();}
    }
    
    public static void jugarD1() {
    	primerMoviment();
    	while(fi==false) {
    	estatTauler();
    	//moviment del Usuari
    	movimentUsuari();
    	estatTauler();
    	guanyar();
    	perdre();
    	empate();
    	estatTauler();
    	//moviment del PC
    	dificultat1();
    	//comprovacio de si hi ha un final
    	guanyar();
    	perdre();
    	empate();
    	//print del tauler
    	estatTauler();
    	}
    	//neteja el tauler i torna a començar
    	novaPartida();
    	
    }
    public static void jugarD2() {
    	//tria de manera semi-aleatoria el primer moviment
    	primerMoviment();
    	while(fi==false) {
        	estatTauler();
        	movimentUsuari();
        	estatTauler();
        	guanyar();
        	perdre();
        	empate();
        	estatTauler();
        	dificultat2();
        	guanyar();
        	perdre();
        	empate();
        	estatTauler();
        	}
    	novaPartida();
    }
    public static void jugarD3() {
    	//tria de manera semi-aleatoria el primer moviment
    	primerMoviment();
    	while(fi==false) {
        	estatTauler();
        	movimentUsuari();
        	estatTauler();
        	guanyar();
        	perdre();
        	empate();
        	estatTauler();
        	dificultat3();
        	guanyar();
        	perdre();
        	empate();
        	estatTauler();
        	}
    	novaPartida();
    }
    
    public static void dificultat() {
    	boolean dificultatTriada=false;
    	while (dificultatTriada==false) {
    		System.out.print("Introdueix la dificultat amb la cual vols jugar (1, 2 o 3): ");
    		dificultat = teclat.nextInt();	
    		if(dificultat<1||dificultat>3) {
    			System.out.println("Les dificultats poden ser 1, 2 o 3");
    			dificultatTriada=false;
    			}
    		else {dificultatTriada=true;}
    	}
    }
    public static void primerMoviment() {
    	//En el primer moviment de la miquina es tria de manera random
    	//entre les 5 posicions clau del joc que es el centre i les cantonades
    	if(dificultat==3) {
    		if(taula[1][1]==0) {taula[1][1]='O';}
    	}
    	if(dificultat==2) {
	    	int numeroAleator2 = (int) (Math.random() * 5+1);
	    	switch(numeroAleator2) {
	    	case 1:taula[0][0]='O';break;
	    	case 2:taula[0][2]='O';break;
	    	case 3:taula[1][1]='O';break;
	    	case 4:taula[2][0]='O';break;
	    	case 5:taula[2][2]='O';
	    	}
	    }
	    	if(dificultat==1) {
		    	int numeroAleatori1 = (int) (Math.random() * 9+1);
		    	switch(numeroAleatori1) {
		    	case 1:taula[0][0]='O';break;
		    	case 2:taula[0][1]='O';break;
		    	case 3:taula[0][2]='O';break;
		    	case 4:taula[1][0]='O';break;
		    	case 5:taula[1][1]='O';break;
		    	case 6:taula[1][2]='O';break;
		    	case 7:taula[2][0]='O';break;
		    	case 8:taula[2][1]='O';break;
		    	case 9:taula[2][2]='O';
		    }
    	}
    }
    public static void dificultat1() {
    	boolean canvi=false;
    	
    	int numeroAleatori = (int) (Math.random() * 9+1);
//Aqui es posa el numero aleatori en la array pero si la posicio esta ocupada,es busca una lliure

    	 while(canvi==false){
 			if(numeroAleatori==1&&taula[0][0]==0){taula[0][0]='O';canvi=true;}
 			else if(numeroAleatori==2&&taula[0][1]==0){taula[0][1]='O';canvi=true;}
 			else if(numeroAleatori==3&&taula[0][2]==0){taula[0][2]='O';canvi=true;}
 			else if(numeroAleatori==4&&taula[1][0]==0){taula[1][0]='O';canvi=true;}
 			else if(numeroAleatori==5&&taula[1][1]==0){taula[1][1]='O';canvi=true;}
 			else if(numeroAleatori==6&&taula[1][2]==0){taula[1][2]='O';canvi=true;}
 			else if(numeroAleatori==7&&taula[2][0]==0){taula[2][0]='O';canvi=true;}
 			else if(numeroAleatori==8&&taula[2][1]==0){taula[2][1]='O';canvi=true;}
 			else if(numeroAleatori==9&&taula[2][2]==0){taula[2][2]='O';canvi=true;}
 			else if(taula[0][0]==0){taula[0][0]='O';canvi=true;numeroAleatori=1;}
 			else if(taula[0][1]==0){taula[0][1]='O';canvi=true;numeroAleatori=2;}
 			else if(taula[0][2]==0){taula[0][2]='O';canvi=true;numeroAleatori=3;}
 			else if(taula[1][0]==0){taula[1][0]='O';canvi=true;numeroAleatori=4;}
 			else if(taula[1][1]==0){taula[1][1]='O';canvi=true;numeroAleatori=5;}
 			else if(taula[1][2]==0){taula[1][2]='O';canvi=true;numeroAleatori=6;}
 			else if(taula[2][0]==0){taula[2][0]='O';canvi=true;numeroAleatori=7;}
 			else if(taula[2][1]==0){taula[2][1]='O';canvi=true;numeroAleatori=8;}
 			else if(taula[2][2]==0){taula[2][2]='O';canvi=true;numeroAleatori=9;}
 			
    	 }
    System.out.println("L'ordinador ha escollit el: "+numeroAleatori);
    }
    public static void dificultat2() {
    	boolean canvi=false;
    	
//Aixo seria la IA de nivell 2 del joc (nomes disponible a la dificultat 2)
    	
//condicions maquina  segons moviments usuari anteriors
    	
//combinacions horitzontals
        if(taula[0][0]=='X' && taula[0][1]=='X' && taula[0][2]==0){
            taula[0][2] = 'O'; canvi = true;
        }
        else if(taula[0][1]=='X' && taula[0][2]=='X' && taula[0][0]==0){
            taula[0][0] = 'O'; canvi = true;
        }
        else if(taula[1][0]=='X' && taula[1][1]=='X' && taula[1][2]==0){
            taula[1][2] = 'O'; canvi = true;
        }
        else if(taula[1][1]=='X' && taula[1][2]=='X' && taula[1][0]==0){
            taula[1][0] = 'O'; canvi = true;
        }
        else if(taula[2][0]=='X' && taula[2][1]=='X' && taula[2][2]==0){
            taula[2][2] = 'O'; canvi = true;
        }
        else if(taula[2][1]=='X' && taula[2][2]=='X' && taula[2][0]==0){
            taula[2][0] = 'O'; canvi = true;
        }
        else if(taula[0][0]=='X' && taula[0][2]=='X' && taula[0][1]==0){
            taula[0][1] = 'O'; canvi = true;
        }
        
        
        
//combinacions verticals
        else if(taula[0][0]=='X' && taula[1][0]=='X' && taula[2][0]==0){
            taula[2][0] = 'O'; canvi = true;
        }
        else if(taula[1][0]=='X' && taula[2][0]=='X' && taula[0][0]==0){
            taula[0][0] = 'O'; canvi = true;
        }
        else if(taula[0][1]=='X' && taula[1][1]=='X' && taula[2][1]==0){
            taula[2][1] = 'O'; canvi = true;
        }
        else if(taula[1][1]=='X' && taula[2][1]=='X' && taula[0][1]==0){
            taula[0][1] = 'O'; canvi = true;
        }
        else if(taula[0][2]=='X' && taula[1][2]=='X' && taula[2][2]==0){
            taula[2][2] = 'O'; canvi = true;
        }
        else if(taula[1][2]=='X' && taula[2][2]=='X' && taula[0][2]==0){
            taula[0][2] = 'O'; canvi = true;
        }
        else if(taula[0][0]=='X' && taula[2][0]=='X' && taula[1][0]==0){
            taula[0][1] = 'O'; canvi = true;
        }
        
//combinacions creuades
        else if(taula[0][0]=='X' && taula[1][1]=='X' && taula[2][2]==0){
            taula[2][2] = 'O'; canvi = true;
        }
        else if(taula[1][1]=='X' && taula[2][2]=='X' && taula[0][0]==0){
            taula[0][0] = 'O'; canvi = true;
        }
        else if(taula[0][2]=='X' && taula[1][1]=='X' && taula[2][0]==0){
            taula[2][0] = 'O'; canvi = true;
        }
        else if(taula[1][1]=='X' && taula[2][0]=='X' && taula[0][2]==0){
            taula[0][2] = 'O'; canvi = true;
        }
        

        if(canvi==false){
//condicions maquina  segons els seus propis moviments
//combinacions horitzontals
	        if(taula[0][0]=='O' && taula[0][1]=='O' && taula[0][2]==0){
	            taula[0][2] = 'O'; canvi = true;
	        }
	        else if(taula[0][1]=='O' && taula[0][2]=='O' && taula[0][0]==0){
	            taula[0][0] = 'O'; canvi = true;
	        }
	        else if(taula[1][0]=='O' && taula[1][1]=='O' && taula[1][2]==0){
	            taula[1][2] = 'O'; canvi = true;
	        }
	        else if(taula[1][1]=='O' && taula[1][2]=='O' && taula[1][0]==0){
	            taula[1][0] = 'O'; canvi = true;
	        }
	        else if(taula[2][0]=='O' && taula[2][1]=='O' && taula[2][2]==0){
	            taula[2][2] = 'O'; canvi = true;
	        }
	        else if(taula[2][1]=='O' && taula[2][2]=='O' && taula[2][0]==0){
	            taula[2][0] = 'O'; canvi = true;
	        }
	        else if(taula[0][0]=='O' && taula[0][2]=='O' && taula[0][1]==0){
	            taula[0][1] = 'O'; canvi = true;
	        }
	        
	        
//combinacions verticals
	        else if(taula[0][0]=='O' && taula[1][0]=='O' && taula[2][0]==0){
	            taula[2][0] = 'O'; canvi = true;
	        }
	        else if(taula[1][0]=='O' && taula[2][0]=='O' && taula[0][0]==0){
	            taula[0][0] = 'O'; canvi = true;
	        }
	        else if(taula[0][1]=='O' && taula[1][1]=='O' && taula[2][1]==0){
	            taula[2][1] = 'O'; canvi = true;
	        }
	        else if(taula[1][1]=='O' && taula[2][1]=='O' && taula[0][1]==0){
	            taula[0][1] = 'O'; canvi = true;
	        }
	        else if(taula[0][2]=='O' && taula[1][2]=='O' && taula[2][2]==0){
	            taula[2][2] = 'O'; canvi = true;
	        }
	        else if(taula[1][2]=='O' && taula[2][2]=='O' && taula[0][2]==0){
	            taula[0][2] = 'O'; canvi = true;
	        }
	        else if(taula[0][2]=='O' && taula[2][2]=='O' && taula[1][2]==0){
	            taula[1][2] = 'O'; canvi = true;
	        }
	        
//combinacions creuades
	        else if(taula[0][0]=='O' && taula[1][1]=='O' && taula[2][2]==0){
	            taula[2][2] = 'O'; canvi = true;
	        }
	        else if(taula[1][1]=='O' && taula[2][2]=='O' && taula[0][0]==0){
	            taula[0][0] = 'O'; canvi = true;
	        }
	        else if(taula[0][2]=='O' && taula[1][1]=='O' && taula[2][0]==0){
	            taula[2][0] = 'O'; canvi = true;
	        }
	        else if(taula[1][1]=='O' && taula[2][0]=='O' && taula[0][2]==0){
	            taula[0][2] = 'O'; canvi = true;
	        }
	        else if(taula[0][0]=='O' && taula[2][2]=='O' && taula[1][1]==0){
	            taula[1][1] = 'O'; canvi = true;
	        }
	        
	        else {
	        	//si no hi ha un moviment evident com els de la part superior
	        	boolean canvi2=false;
	        	
	        	int numeroAleatori = (int) (Math.random() * 9+1);
	    //Aqui es posa el numero aleatori en la array pero si la posicio esta ocupada,es busca una lliure

        	 while(canvi2==false){
        		 if(numeroAleatori==1&&taula[1][1]==0) {taula[1][1]='O';}
 				else if(numeroAleatori==2&&taula[0][0]==0) {taula[0][0]='O';canvi2=true;}
 				else if(numeroAleatori==3&&taula[0][2]==0) {taula[0][2]='O';canvi2=true;}
 				else if(numeroAleatori==4&&taula[2][2]==0) {taula[2][2]='O';canvi2=true;}
 				else if(numeroAleatori==5&&taula[2][0]==0) {taula[2][0]='O';canvi2=true;}
 				else if(numeroAleatori==6&&taula[0][1]==0) {taula[0][1]='O';canvi2=true;}
 				else if(numeroAleatori==7&&taula[1][0]==0) {taula[1][0]='O';canvi2=true;}
 				else if(numeroAleatori==8&&taula[1][2]==0) {taula[1][2]='O';canvi2=true;}
 				else if(numeroAleatori==9&&taula[2][1]==0) {taula[2][1]='O';canvi2=true;}
 				else if(taula[1][1]==0) {taula[1][1]='O';canvi2=true;}
				else if(taula[0][0]==0) {taula[0][0]='O';canvi2=true;}
				else if(taula[0][2]==0) {taula[0][2]='O';canvi2=true;}
				else if(taula[2][2]==0) {taula[2][2]='O';canvi2=true;}
				else if(taula[2][0]==0) {taula[2][0]='O';canvi2=true;}
				else if(taula[0][1]==0) {taula[0][1]='O';canvi2=true;}
				else if(taula[1][0]==0) {taula[1][0]='O';canvi2=true;}
				else if(taula[1][2]==0) {taula[1][2]='O';canvi2=true;}
				else if(taula[2][1]==0) {taula[2][1]='O';canvi2=true;}
	        	 }
	        }
        }
        
    }
    public static void dificultat3() {
    	boolean canvi=false;
    	
//Aixo seria la IA de nivell 3 del joc (nomes disponible a la dificultat 3)
    	//condicions maquina  segons els seus propis moviments
    	//combinacions creuades
         if(taula[0][0]=='O' && taula[1][1]=='O' && taula[2][2]==0){
            taula[2][2] = 'O'; canvi = true;
        }
        else if(taula[1][1]=='O' && taula[2][2]=='O' && taula[0][0]==0){
            taula[0][0] = 'O'; canvi = true;
        }
        else if(taula[0][2]=='O' && taula[1][1]=='O' && taula[2][0]==0){
            taula[2][0] = 'O'; canvi = true;
        }
        else if(taula[1][1]=='O' && taula[2][0]=='O' && taula[0][2]==0){
            taula[0][2] = 'O'; canvi = true;
        }
        else if(taula[0][0]=='O' && taula[2][2]=='O' && taula[1][1]==0){
            taula[1][1] = 'O'; canvi = true;
        }
        else if(taula[0][2]=='O' && taula[2][0]=='O' && taula[1][1]==0){
            taula[1][1] = 'O'; canvi = true;
        }
    	//combinacions horitzontals
        else if(taula[0][0]=='O' && taula[0][1]=='O' && taula[0][2]==0){
    		            taula[0][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][1]=='O' && taula[0][2]=='O' && taula[0][0]==0){
    		            taula[0][0] = 'O'; canvi = true;
    		        }
    		        else if(taula[1][0]=='O' && taula[1][1]=='O' && taula[1][2]==0){
    		            taula[1][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[1][1]=='O' && taula[1][2]=='O' && taula[1][0]==0){
    		            taula[1][0] = 'O'; canvi = true;
    		        }
    		        else if(taula[2][0]=='O' && taula[2][1]=='O' && taula[2][2]==0){
    		            taula[2][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[2][1]=='O' && taula[2][2]=='O' && taula[2][0]==0){
    		            taula[2][0] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][0]=='O' && taula[0][2]=='O' && taula[0][1]==0){
    		            taula[0][1] = 'O'; canvi = true;
    		        }
    		        else if(taula[1][0]=='O' && taula[1][2]=='O' && taula[1][1]==0){
    		            taula[1][1] = 'O'; canvi = true;
    		        }
    		        else if(taula[2][0]=='O' && taula[2][2]=='O' && taula[2][1]==0){
    		            taula[2][1] = 'O'; canvi = true;
    		        }
    		        
    	//combinacions verticals
    		        else if(taula[0][0]=='O' && taula[1][0]=='O' && taula[2][0]==0){
    		            taula[2][0] = 'O'; canvi = true;
    		        }
    		        else if(taula[1][0]=='O' && taula[2][0]=='O' && taula[0][0]==0){
    		            taula[0][0] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][1]=='O' && taula[1][1]=='O' && taula[2][1]==0){
    		            taula[2][1] = 'O'; canvi = true;
    		        }
    		        else if(taula[1][1]=='O' && taula[2][1]=='O' && taula[0][1]==0){
    		            taula[0][1] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][2]=='O' && taula[1][2]=='O' && taula[2][2]==0){
    		            taula[2][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[1][2]=='O' && taula[2][2]=='O' && taula[0][2]==0){
    		            taula[0][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][2]=='O' && taula[2][2]=='O' && taula[1][2]==0){
    		            taula[1][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][1]=='O' && taula[2][1]=='O' && taula[1][1]==0){
    		            taula[0][2] = 'O'; canvi = true;
    		        }
    		        else if(taula[0][0]=='O' && taula[2][0]=='O' && taula[1][0]==0){
    		            taula[1][0] = 'O'; canvi = true;
    		        }
    	



        if(canvi==false){
        	//condicions maquina  segons moviments usuari anteriors
        	//combinacions creuades
             if(taula[0][0]=='X' && taula[1][1]=='X' && taula[2][2]==0){
                taula[2][2] = 'O'; canvi = true;
            }
            else if(taula[1][1]=='X' && taula[2][2]=='X' && taula[0][0]==0){
                taula[0][0] = 'O'; canvi = true;
            }
            else if(taula[0][2]=='X' && taula[1][1]=='X' && taula[2][0]==0){
                taula[2][0] = 'O'; canvi = true;
            }
            else if(taula[1][1]=='X' && taula[2][0]=='X' && taula[0][2]==0){
                taula[0][2] = 'O'; canvi = true;
            }
            else if(taula[0][0]=='X' && taula[2][2]=='X' && taula[1][1]==0){
                taula[1][1] = 'O'; canvi = true;
            }
            else if(taula[0][2]=='X' && taula[2][0]=='X' && taula[1][1]==0){
                taula[1][1] = 'O'; canvi = true;
            }    	
    //combinacions horitzontals
            else if(taula[0][0]=='X' && taula[0][1]=='X' && taula[0][2]==0){
                taula[0][2] = 'O'; canvi = true;
            }
            else if(taula[0][1]=='X' && taula[0][2]=='X' && taula[0][0]==0){
                taula[0][0] = 'O'; canvi = true;
            }
            else if(taula[1][0]=='X' && taula[1][1]=='X' && taula[1][2]==0){
                taula[1][2] = 'O'; canvi = true;
            }
            else if(taula[1][1]=='X' && taula[1][2]=='X' && taula[1][0]==0){
                taula[1][0] = 'O'; canvi = true;
            }
            else if(taula[2][0]=='X' && taula[2][1]=='X' && taula[2][2]==0){
                taula[2][2] = 'O'; canvi = true;
            }
            else if(taula[2][1]=='X' && taula[2][2]=='X' && taula[2][0]==0){
                taula[2][0] = 'O'; canvi = true;
            }
            else if(taula[0][0]=='X' && taula[0][2]=='X' && taula[0][1]==0){
                taula[0][1] = 'O'; canvi = true;
            }
            else if(taula[1][0]=='X' && taula[1][2]=='X' && taula[1][1]==0){
                taula[1][1] = 'O'; canvi = true;
            }
            else if(taula[2][0]=='X' && taula[2][2]=='X' && taula[2][1]==0){
                taula[2][1] = 'O'; canvi = true;
            }
            
    //combinacions verticals
            else if(taula[0][0]=='X' && taula[1][0]=='X' && taula[2][0]==0){
                taula[2][0] = 'O'; canvi = true;
            }
            else if(taula[1][0]=='X' && taula[2][0]=='X' && taula[0][0]==0){
                taula[0][0] = 'O'; canvi = true;
            }
            else if(taula[0][1]=='X' && taula[1][1]=='X' && taula[2][1]==0){
                taula[2][1] = 'O'; canvi = true;
            }
            else if(taula[1][1]=='X' && taula[2][1]=='X' && taula[0][1]==0){
                taula[0][1] = 'O'; canvi = true;
            }
            else if(taula[0][2]=='X' && taula[1][2]=='X' && taula[2][2]==0){
                taula[2][2] = 'O'; canvi = true;
            }
            else if(taula[1][2]=='X' && taula[2][2]=='X' && taula[0][2]==0){
                taula[0][2] = 'O'; canvi = true;
            }
            else if(taula[0][0]=='X' && taula[2][0]=='X' && taula[1][0]==0){
                taula[0][1] = 'O'; canvi = true;
            }
            else if(taula[0][1]=='X' && taula[2][1]=='X' && taula[1][1]==0){
                taula[1][1] = 'O'; canvi = true;
            }
            else if(taula[0][2]=='X' && taula[2][2]=='X' && taula[1][2]==0){
                taula[1][2] = 'O'; canvi = true;
            }
	        else {
	        	//si no hi ha un moviment evident com els de la part superior
	        	boolean canvi2=false;
	        	
	        	int numeroAleatori = (int) (Math.random() * 9+1);
	    //Aqui es posa el numero aleatori en la array pero si la posicio esta ocupada,es busca una lliure

        	 while(canvi2==false){
        		 if(numeroAleatori==1&&taula[1][1]==0) {taula[1][1]='O';}
 				else if(numeroAleatori==2&&taula[0][0]==0) {taula[0][0]='O';canvi2=true;}
 				else if(numeroAleatori==3&&taula[0][2]==0) {taula[0][2]='O';canvi2=true;}
 				else if(numeroAleatori==4&&taula[2][2]==0) {taula[2][2]='O';canvi2=true;}
 				else if(numeroAleatori==5&&taula[2][0]==0) {taula[2][0]='O';canvi2=true;}
 				else if(numeroAleatori==6&&taula[0][1]==0) {taula[0][1]='O';canvi2=true;}
 				else if(numeroAleatori==7&&taula[1][0]==0) {taula[1][0]='O';canvi2=true;}
 				else if(numeroAleatori==8&&taula[1][2]==0) {taula[1][2]='O';canvi2=true;}
 				else if(numeroAleatori==9&&taula[2][1]==0) {taula[2][1]='O';canvi2=true;}
 				else if(taula[1][1]==0) {taula[1][1]='O';canvi2=true;}
				else if(taula[0][0]==0) {taula[0][0]='O';canvi2=true;}
				else if(taula[0][2]==0) {taula[0][2]='O';canvi2=true;}
				else if(taula[2][2]==0) {taula[2][2]='O';canvi2=true;}
				else if(taula[2][0]==0) {taula[2][0]='O';canvi2=true;}
				else if(taula[0][1]==0) {taula[0][1]='O';canvi2=true;}
				else if(taula[1][0]==0) {taula[1][0]='O';canvi2=true;}
				else if(taula[1][2]==0) {taula[1][2]='O';canvi2=true;}
				else if(taula[2][1]==0) {taula[2][1]='O';canvi2=true;}
	        	 }
	        	 
	        }
        }
        
    }
    	
    public static void movimentUsuari() {
        int casella;
        boolean canvi=false;
        	while(canvi ==false){
//l'usuari introdueix el numero de la casella que vol ocupar
    	    	System.out.print("Digues un valor: ");
    	    	casella = teclat.nextInt();
    	    	if(casella>9||casella<1){
    	    		System.out.println("Has de introduir un valor entre 1 i 9");
    	    	}
    	    	//comprobacio de la la casella esta lliure
    	    	switch(casella){
    	    		case 1:
    	    			if(taula[0][0]==0){taula[0][0] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 2:
    	    			if(taula[0][1]==0){taula[0][1] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 3: 
    	    			if(taula[0][2]==0){taula[0][2] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 4:
    	    			if(taula[1][0]==0){taula[1][0] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 5: 
    	    			if(taula[1][1]==0){taula[1][1] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 6:
    	    			if(taula[1][2]==0){taula[1][2] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 7:
    	    			if(taula[2][0]==0){taula[2][0] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 8: 
    	    			if(taula[2][1]==0){taula[2][1] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    		case 9:
    	    			if(taula[2][2]==0){taula[2][2] = 'X'; canvi = true;}
    	    			else{System.out.println("Aquesta casella ja esta ocupada"); canvi = false;}
    	    			break;
    	    	}
    	    }
        }
    
    
    public static boolean guanyar() {
//guanya usuari
//combinacions horitzontals
        if(taula[0][0]=='X' && taula[0][1]=='X' && taula[0][2]=='X'){
        System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        else if(taula[1][0]=='X' && taula[1][1]=='X' && taula[1][2]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        else if(taula[2][0]=='X' && taula[2][1]=='X' && taula[2][2]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        
//combinacions verticals
        else if(taula[0][0]=='X' && taula[1][0]=='X' && taula[2][0]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        else if(taula[0][1]=='X' && taula[1][1]=='X' && taula[2][1]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        else if(taula[0][2]=='X' && taula[1][2]=='X' && taula[2][2]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        
//combinacions creuades
        else if(taula[0][0]=='X' && taula[1][1]=='X' && taula[2][2]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        else if(taula[0][2]=='X' && taula[1][1]=='X' && taula[2][0]=='X'){
            System.out.println("Has guanyat!!!!"); fi = true;win++;
        }
        
        if(fi==false){
        	empate();
        }
        return true;
    }
    
    public static void perdre() {
//guanya PC
//Combinations horitzontals
        if(taula[0][0]=='O' && taula[0][1]=='O' && taula[0][2]=='O'){
        System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        else if(taula[1][0]=='O' && taula[1][1]=='O' && taula[1][2]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        else if(taula[2][0]=='O' && taula[2][1]=='O' && taula[2][2]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        
//Combinations verticals
        else if(taula[0][0]=='O' && taula[1][0]=='O' && taula[2][0]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        else if(taula[0][1]=='O' && taula[1][1]=='O' && taula[2][1]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        else if(taula[0][2]=='O' && taula[1][2]=='O' && taula[2][2]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        
//combinacions creuades
        else if(taula[0][0]=='O' && taula[1][1]=='O' && taula[2][2]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
        else if(taula[0][2]=='O' && taula[1][1]=='O' && taula[2][0]=='O'){
            System.out.println("Ha guanyat el PC"); fi = true;lose++;
        }
    }
    
    public static void empate() {
        if(taula[0][0]!=0&&taula[0][1]!=0&&taula[0][2]!=0&&taula[1][0]!=0&&taula[1][1]!=0
         &&taula[1][2]!=0&&taula[2][0]!=0&&taula[2][1]!=0&&taula[2][2]!=0){
            System.out.println("Empate!!!");
            fi=true;
            draw++;
            } 
        }
    
    public static void estatTauler() {
		System.out.println("L'estat del tauler és: ");
		System.out.println("╔═══╦═══╦═══╗");
		System.out.println("║ "+taula[0][0]+" ║ "+taula[0][1]+" ║ "+taula[0][2]+" ║");
		System.out.println("╠═══╬═══╬═══╣");
		System.out.println("║ "+taula[1][0]+" ║ "+taula[1][1]+" ║ "+taula[1][2]+" ║");
		System.out.println("╠═══╬═══╬═══╣");
		System.out.println("║ "+taula[2][0]+" ║ "+taula[2][1]+" ║ "+taula[2][2]+" ║");
		System.out.println("╚═══╩═══╩═══╝");
		System.out.println("");
	
    }
    public static  void novaPartida() {
    	char continuar;
    	boolean newPlay=false;
    System.out.println("Vols fer un altre partida? (introdueix S per continuar o N per acabar)");
    continuar = teclat.next().charAt(0);
    while(newPlay==false) {
    	
    	if(continuar=='n' || continuar=='N'){
    		System.out.println("Fi del joc");
    		System.out.println("--ESTADISTIQUES--");
    		System.out.println("Victories: "+win);
    		System.out.println("Derrotes: "+lose);
    		System.out.println("Empats: "+draw/2);
    		System.exit(0);
    	}
    	else{
    		if(continuar=='s' || continuar=='S'){
    			//nateja la array bidimensional
    			for(int i=0;i<3;i++) {
    				for(int j=0;j<3;j++) {
    					taula[i][j]=0;
    				}
    			}
	    			fi = false;
	    			main(null);
    			}
    			else{
		    		System.out.println("Has de introduir S o N");
		    		continuar = teclat.next().charAt(0);
		    	} 
    		}
    	}
    } 
}