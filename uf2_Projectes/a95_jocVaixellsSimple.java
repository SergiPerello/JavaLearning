package uf2_Projectes;

import java.util.Scanner;

public class a95_jocVaixellsSimple {

    public static int numJugador1 = 1;
    public static int numJugador2 = 2;
    public static int T=5;
    public static void main (String [] args) {

        a95_jocVaixellsSimple programa = new a95_jocVaixellsSimple();
        programa.controlador();
    }

    private void controlador(){
        Scanner teclat = new Scanner(System.in);
        int[][] tauler1 = new int[T][T];
        int[][] tauler2 = new int[T][T];
        int[][] taulerAtacs1 = new int[T][T];
        int[][] taulerAtacs2 = new int[T][T];
        int[] coordenades = new int[2];
        boolean guanyar;
        int seguirJugant;

        //Aquest do while comprova si l'usuari vol realitzar un altre partida després de la ja finaltzada
        do{
            guanyar=false;
            for(int i=0; i<T; i++){
                for(int j=0; j<T; j++){
                    tauler1[i][j] = 0;
                    tauler2[i][j] = 0;
                    taulerAtacs1[i][j] = 0;
                    taulerAtacs2[i][j] = 0;
                }
            }
            //col·locar els vaixells dels jugadors
            System.out.println("Col·loca els vaixells del PRIMER JUGADOR");
            for (int i =0; i<5;i++){
                tauler1=taulerjugador(tauler1);
                printTauler(tauler1);

            }
            System.out.println("Col·loca els vaixells del SEGON JUGADOR");
            for (int i =0; i<5;i++){
                tauler2=taulerjugador(tauler2);
                printTauler(tauler2);
            }
            //El bucle do while següent comrpoba si algun jugador ha guanyat per a que en el cas petinent es passi el torn al bucle superior
            do{
                //torn de atacs de jugador1
                System.out.println("Torn del primer jugador");
                printTaulerAtacs(taulerAtacs1);
                coordenades=atacs();
                taulerAtacs1=registreAtacs(taulerAtacs1,tauler1,coordenades);
                enfonsar(tauler1,coordenades);
                //comprovo si guanya el jugador1
                guanyador(tauler1,numJugador1);

                if(guanyar==false){
                    //torn de atacs de jugador2
                    System.out.println("Torn del segon jugador");
                    printTaulerAtacs(taulerAtacs2);
                    coordenades=atacs();
                    taulerAtacs2=registreAtacs(taulerAtacs2,tauler2,coordenades);
                    enfonsar(tauler2,coordenades);
                    //comprovo i guanya el jugador2
                    guanyar=guanyador(tauler2,numJugador2);
                }
            } while(guanyar==false);
            System.out.println("Vols fer un altre partida? (Introdueix 0 si vols finalitzar o 1 si vols realitzar un altre partida)");
            seguirJugant=teclat.nextInt();
        } while(seguirJugant == 1);
        teclat.close();
    }
    //omplir tauler del primer jugador a partir de coordenades
    private int[][] taulerjugador(int [][] tauler){
        int fila, columna;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix la columna: ");
        do{
            columna = llegirEnter()-1;
            if(columna<0||columna>4){
                System.out.print("No es un valor valid, introdueix un altre numero: ");
            }
        }while(columna<0||columna>4);
        System.out.print("Introdueix la fila: ");
        do {
            fila = llegirEnter() - 1;
            if (fila < 0 || fila > 4) {
                System.out.print("No es un valor valid, introdueix un altre numero: ");
            }
        }while(fila<0||fila>4);
        if(tauler[columna][fila]==0){
            tauler[columna][fila]=1;
        }
        return tauler;
    }

    //introducció de les coordenades del vaixell que es vol enfonsar
    private int[] atacs(){
        Scanner teclat = new Scanner(System.in);
        int [] coordenades = new int[2];
        System.out.print("Introdueix la fila a la que vols atacar: ");
        do{
            coordenades[0] = llegirEnter()-1;
            if(coordenades[0]<0||coordenades[0]>4){
                System.out.print("No es un valor valid, introdueix un altre numero: ");
            }
        }while(coordenades[0]<0||coordenades[0]>4);
        System.out.print("Introdueix la columna a la que vols atacar: ");
        do{
            coordenades[1] = llegirEnter()-1;
            if(coordenades[1]<0||coordenades[1]>4){
                System.out.print("No es un valor valid, introdueix un altre numero: ");
            }
        }while(coordenades[1]<0||coordenades[1]>4);
        return coordenades;
    }

    //a partir de les coordenades anteriors enfonso el vaixell o en el cas contrari indico que hi ha aigua
    private int[][] enfonsar(int [][] tauler,int [] coordenades) {

        if (tauler[coordenades[0]][coordenades[1]] == 1) {
            System.out.println("Tocat i enfonsat");
            tauler[coordenades[0]][coordenades[1]] = 0;
        }
        else{
            System.out.println("No has tocat cap vaixell");
        }
        return tauler;
    }
    //Taula que guarda els llocs a on ha atacat cada jugador(indicar quin jugador per parametres), cridar abans de enfonsar
    private int[][] registreAtacs(int [][] taulerAtacs,int [][] tauler,int [] coordenades) {

        if (tauler[coordenades[0]][coordenades[1]] == 1) {
            taulerAtacs[coordenades[0]][coordenades[1]] = 2;
        }
        else{
            taulerAtacs[coordenades[0]][coordenades[1]] = 1;
        }
        return taulerAtacs;
    }

    private boolean guanyador(int [][] tauler,int numJugador){
        boolean guanyar = true;
        //comproba si un tauler s'ha quedat buit però dona massa voltes ja que un cop trobada una casella que impedeix guanyar segueix donant voltes
        for(int col=0;col<T;col++){
            for(int row=0;row<T;row++){
                if(tauler[col][row]==1) guanyar = false;
                else guanyar = true;
            }
        }
        //si en la anterior comprobació a traves de bucles es troba que el tauler disposa de totes les coordenades buides s'indica que l
        // jugador( més el numero de jugador passat per parametres)  ha guanyat i es finalitza el joc
        if(guanyar==true){
            System.out.println("Ha guanyat el jugador numero "+numJugador);
        }
        return guanyar;
    }

    private void printTauler(int [][] taula) {
        char [][]cTaula = new char [T][T];
        for (int i=0;i<T;i++) {
            for (int j=0;j<T;j++) {
                if		(taula[i][j]==0) cTaula[i][j]=' ';
                else if (taula[i][j]==1) cTaula[i][j]='■';
            }
        }
        estatTauler(cTaula);
    }

    private void printTaulerAtacs(int [][] taula) {
        char [][]cTaula = new char [T][T];
        for (int i=0;i<T;i++) {
            for (int j=0;j<T;j++) {
                if		(taula[i][j]==0) cTaula[i][j]=' ';
                else if (taula[i][j]==1) cTaula[i][j]='Ж';
                else if (taula[i][j]==2) cTaula[i][j]='■';
            }
        }
        estatTauler(cTaula);
    }

    private void estatTauler( char[][] t) {
        System.out.print("╔═══╦═══╦═══╦═══╦═══╗\r\n"+
                "║ "+t[0][0]+" ║ "+t[0][1]+" ║ "+t[0][2]+" ║ "+t[0][3]+" ║ "+t[0][4]+" ║\r\n"+
                "╠═══╬═══╬═══╬═══╬═══╣\r\n"+
                "║ "+t[1][0]+" ║ "+t[1][1]+" ║ "+t[1][2]+" ║ "+t[1][3]+" ║ "+t[1][4]+" ║\r\n"+
                "╠═══╬═══╬═══╬═══╬═══╣\r\n"+
                "║ "+t[2][0]+" ║ "+t[2][1]+" ║ "+t[2][2]+" ║ "+t[2][3]+" ║ "+t[2][4]+" ║\r\n"+
                "╠═══╬═══╬═══╬═══╬═══╣\r\n"+
                "║ "+t[3][0]+" ║ "+t[3][1]+" ║ "+t[3][2]+" ║ "+t[3][3]+" ║ "+t[3][4]+" ║\r\n"+
                "╠═══╬═══╬═══╬═══╬═══╣\r\n"+
                "║ "+t[4][0]+" ║ "+t[4][1]+" ║ "+t[4][2]+" ║ "+t[4][3]+" ║ "+t[4][4]+" ║\r\n"+
                "╚═══╩═══╩═══╩═══╩═══╝\r\n");
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

}