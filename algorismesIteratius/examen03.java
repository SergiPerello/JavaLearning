package algorismesIteratius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class examen03 {

	public static void main(String[] args) throws IOException {
		int a,b,minus=0, mayus=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriu una frase: ");
		a = buffer.read();
		while(a != 13) {
			b = (char) a;
			if (b == 'a'||b == 'e'||b == 'i'||b == 'o'||b == 'u') minus++;
			if (b == 'A'||b == 'E'||b == 'I'||b == 'O'||b == 'U') mayus++;
            a = buffer.read();
        }
		System.out.println(minus+" vocals en minúscula i "+mayus+" vocals en majúscula");
	}

}
