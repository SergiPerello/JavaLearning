package uf2_Projectes;

import java.util.Scanner;

public class a94_jocVida {
	
	public static int T=17;
	public static void main(String[] args) {
	
		a94_jocVida programa = new a94_jocVida();
		programa.controlador();
        }
    	
    	private void controlador(){
    	    Scanner teclat = new Scanner(System.in);
    	    int [][]taula = new int [T][T];
	        int [][]numVida = new int [T][T];
	        int tipusJoc = 0;
		    boolean comprobacio = false;
		    System.out.print("Escriu 1 si vols pintar aleatori o 2 si vols pintar el mapa manualment: ");
		     do{
		    	 tipusJoc = llegirEnter();
		    	 if(tipusJoc<1 || tipusJoc>2){
		    		 System.out.print("Has de introduir un valor valid: ");
		    	 }
           }while(tipusJoc<1 || tipusJoc>2);
		    //tipus random
		    if(tipusJoc==1){
		        taula=omplirTaulerRandom(taula);
    		    while(comprobacio==false){
    		        numVida=contadorVida(taula,numVida);
    		        taula=calculNovaVida(taula,numVida);
    		        transformarTauler(taula);
    		        esperar();
    		        }
		    }
		    //tipus tria usuari
		    else if(tipusJoc==2){
		        taula=usuariTria(taula);
    		    while(comprobacio==false){
    		        numVida=contadorVida(taula,numVida);
    		        taula=calculNovaVida(taula,numVida);
    		        transformarTauler(taula);
    		        esperar();
    		        }
		    }
		    teclat.close();
    	}
    	
    	public int llegirEnter(){
			
			Scanner lector = new Scanner(System.in);
			int correcte = 0;
			
			while (!lector.hasNextInt()){
					lector.next();
					System.out.print("No es un enter. Introdueix un altre numero: ");
			}
			correcte=lector.nextInt();
			lector.nextLine();
			return correcte;
		}
    	
    	public void esperar() {
    		try	{Thread.sleep(150);}
    		catch(InterruptedException ex){Thread.currentThread().interrupt();}
    	}
    	
    	private int[][] omplirTaulerRandom(int [][]taula) {
    		for (int i=1;i<(T-1);i++) {
    			for (int j=1;j<(T-1);j++) {
    				taula[i][j]=(int)(Math.random()*2);
    			}
    		}
    		return taula;
	    }
    	private int[][] contadorVida(int[][] taula,int[][] numVida){
        //Miro si una casella esta ocupada i vaig assignant a les caselles del seu voltant +1
        //No es contemplen les caselles extres
		for (int i = 0;i<T;i++){
            for (int j = 0;j<T;j++){
                numVida[i][j]=0;
            }
        }
        for (int i = 1;i<(T-1);i++){
            for (int j = 1;j<(T-1);j++){
                if(taula[i][j]==1){
                    numVida[i-1][j-1]+=1;
                    numVida[i-1][j]+=1;
                    numVida[i-1][j+1]+=1;
                    numVida[i][j-1]+=1;
                    numVida[i][j+1]+=1;
                    numVida[i+1][j-1]+=1;
                    numVida[i+1][j]+=1;
                    numVida[i+1][j+1]+=1;
                }
            }
        }
        return numVida;
    	}
        
        private int[][] calculNovaVida(int[][] taula,int[][] numVida){
        //Assignació a la nova generació segons condicions del joc de la vida
            for (int i = 1;i<(T-1);i++){
                for (int j = 1;j<(T-1);j++){
                    if(numVida[i][j]<2||numVida[i][j]>3) {taula[i][j]=0;}//Mort
		            else if(taula[i][j]==1&&(numVida[i][j]==2||numVida[i][j]==3)) {taula[i][j]=1;}//Mantè
		            else if(taula[i][j]==0&&(numVida[i][j]==3)) {taula[i][j]=1;}//Viu
                }
            }
            return taula;
        }
        
        private int[][] usuariTria(int [][] taula) {
    		Scanner sc = new Scanner(System.in);
    		char end;
    		int row,col;
			do {
				System.out.print("Indica row (1-15): ");
				do {
	        		row = llegirEnter();
	        		if (row < 1 || row > 15) System.out.print("Valor erroni, has de introduir un valor entre 1 i 15: ");
				} while (row < 1 || row > 15);
        		System.out.print("Indica col (1-15): ");
        		do {
        			col = llegirEnter();
        			if (col < 1 || col > 15) System.out.print("Valor erroni, has de introduir un valor entre 1 i 15: ");
        		} while (col < 1 || col > 15);
        		taula [col][row] = 1;
        		transformarTauler(taula);
        		System.out.print("Vols afegir una coordenada més? (Y o N): ");
        		end = sc.next().charAt(0);
        		end = Character.toUpperCase(end);
    		} while (end == 'Y');
			sc.close();
			return taula;
    	}
        
		private void transformarTauler(int [][] taula) {
        	char [][]cTaula = new char [T][T];
        	for (int i=0;i<T;i++) {
        		for (int j=0;j<T;j++) {
        			if (taula[i][j]==0) cTaula[i][j]=' ';
        			if (taula[i][j]==1) cTaula[i][j]='■';
        		}
        	}
        	estatTauler(cTaula);
        }

		private void estatTauler( char[][] t) {
			int COLS=15, ROWS=15;
			System.out.println("╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗");
			for (int i=1; i<=COLS;i++) {
				if (i>1) System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
				for (int j=1;j<=ROWS;j++) {
					if (j<=1) System.out.print("║ ");
					System.out.print(t[i][j]+" ║ ");
				}System.out.print("\n");
			}System.out.println("╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╝");
		}
	}