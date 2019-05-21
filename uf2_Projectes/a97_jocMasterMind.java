package uf2_Projectes;

import java.util.Arrays;
import java.util.Scanner;

public class a97_jocMasterMind {

	String[] availableColors = {"WHITE","BLACK","RED","PURPLE","YELLOW","CREAM"};
	int nColors = 4;
	
	public static void main(String[] args) {
		a97_jocMasterMind programa = new a97_jocMasterMind();
		programa.controller();
	}
	
	private void controller() {
		System.out.println("Available colors: WHITE, BLACK, RED, PURPLE, YELLOW o CREAM");
		System.out.print("Player1, set 4 color sequence: ");
		String p1Sequence[] = p1SetColors(nColors);
	}
	/* Player1 sets the 4 color sequence and check if it's a color avaliable */
	private String[] p1SetColors(int loops) {
		String p1Sequence[] = new String[nColors];
		Scanner sc = new Scanner(System.in);
		String color;
		boolean found;
		for (int i=0; i<loops;i++) {
			color = sc.nextLine();
			color = color.toUpperCase();
			found = checkSequence(color);
			if (found == false) {
				System.out.print("Not available color, try again. ");
				i--;
			}
			else p1Sequence[i] = color;
			if (i!=loops-1) System.out.print("Set color: ");
		}
		System.out.println("Your sequence is: ");
		System.out.println(Arrays.toString(p1Sequence));
		return p1Sequence;
	}
	
	private boolean checkSequence(String color) {
		boolean found = false;
		int i = 0;
		int j = availableColors.length;
		while (found == false && i<j) {
			if (color.equals(availableColors[i])) found = true;
			else i++;
		}
		return found;
	}
	
	private void p2trySequence() {
		
	}

}
/*
p1SetColors --
	checkSequence --
p2trySequence
encertar
comprova
mostra
*/