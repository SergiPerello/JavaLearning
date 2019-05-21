package uf2_Projectes;

import java.util.Scanner;

public class a96_jocSimonDice {
    public static int T = 20;
    public static void main (String [] args) throws InterruptedException{
        a96_jocSimonDice programa = new a96_jocSimonDice();
        programa.controlador();
    }
    private void controlador()throws InterruptedException {
        int taula[] = new int[T];
        int altrePartida = 0;
        int nouColor = 0;
        int nivell;
        Scanner teclat = new Scanner(System.in);
        boolean error = false;
        int contador = 0;
        int color = 0;
        //bucle que pregunta a l'usuari si vol fer mes partides i fa les modificacions necesaries per tornar a començar le joc
        nivell = triarNivell();
        //bucle que finalitza quan l'usuari introdueix malament un color
        do {
            taula[contador] = generarColor(nouColor);
            mostrarColors(taula, nivell);
            System.out.println("Introdueix els colors");
            for (int i = 0; i < contador+1; i++) {
                if(!error){
                    color = usuariIntrodueix();
                    error = comprobarColors(i, taula, color, error);
                }
            }

            if(!error) {
                contador++;
                System.out.println("La teva puntuació és: " + contador);
            }
            else{
                System.out.println("La teva puntuació final és: " + contador);
            }
        } while (!error);
        boolean playAgain = seguirJugant();
        if (playAgain == true) controlador();
        else System.out.println("Fi del joc");
    }
    
    private boolean seguirJugant() {
    	Scanner sc = new Scanner(System.in);
    	boolean bPlayAgain = false;
    	char cPlayAgain;
    	System.out.print("Fi del joc, vols jugar una altre partida(Y o N): ");
    	cPlayAgain = sc.next().charAt(0);
    	cPlayAgain = Character.toLowerCase(cPlayAgain);
    	if (cPlayAgain == 'y')
    		bPlayAgain = true;
    	return bPlayAgain;
    }
    
    //genera un numero que representa el nou color de la cadena, es guarda a l'array taula
    private int generarColor(int nouColor){
        nouColor = 0;
        nouColor = 1 + (int) (Math.random() * 4);
        return nouColor;
    }
    // usuari introdueix un color en un string i aquest segons el contingut passa a ser el seu numero
    private int usuariIntrodueix(){
        Scanner teclat = new Scanner(System.in);
        String color;
        int numeroColor = 0;
        color = teclat.nextLine();
        color = color.toLowerCase();
        switch (color){
            case "vermell" : numeroColor = 1;
                break;
            case "blau" : numeroColor = 2;
                break;
            case "groc" : numeroColor = 3;
                break;
            case "verd" : numeroColor = 4;
                break;
        }
        return numeroColor;

    }
    //Li paso la taula i segons el numero que contingui mostrara un color o un altre
    private void mostrarColors(int [] taula, int nivell)throws InterruptedException{
        for(int i=0;i<T;i++){
            switch (taula[i]){
                case 1 : System.out.println("vermell");
                    break;
                case 2 : System.out.println("blau");
                    break;
                case 3 : System.out.println("groc");
                    break;
                case 4 : System.out.println("verd");
                    break;
            }
        }
        tempsEspera(nivell);
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n");
    }
    //li paso la posicio de la taula que ha de comprobar(variable i, la taula, el color que ha introduit l usuari
    // i el comprobador de si s'ha comes un error
    private boolean comprobarColors(int i,int [] taula,int color,boolean error){

        if(taula[i]!=color){
            error=true;
            System.out.println("T'has equivocat!");
        }
        return error;
    }

    private int triarNivell(){
        int nivell;
        System.out.print("Introdueix el nivell amb el que vols jugar(1,2,3): ");
        nivell = llegirEnter();

        return nivell;
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

    private void tempsEspera (int nivell)throws InterruptedException{
        switch (nivell){
            case 1:esperar(5);
                break;
            case 2:esperar(3);
                break;
            case 3:esperar(1);
                break;
        }
    }

    private void esperar(int segons) throws InterruptedException {
        Thread.sleep(segons*1000);
    }

}