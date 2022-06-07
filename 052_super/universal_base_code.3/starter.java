import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Apprentice a1 = new Apprentice();
		Apprentice a2 = new Apprentice("LCHS", 3);
		Apprentice a3 = new Apprentice("Trombone", "PHS", 5);
		Apprentice a4 = new Apprentice("Drea", 15, "Voice", "PHS", 6);
		
		a1.playInstrument();
		a2.practice();
		a3.perform();
		a4.practiceAtUniversity();



		
	}
}
