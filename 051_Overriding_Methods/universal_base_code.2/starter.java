import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Musician mus1 = new Musician("Ye", "Piano");
		Musician mus2 = new Musician("Taylor", 32, "Guitar");
		
		System.out.println(mus1.getName() + " plays the " + mus1.getInstrument());
		mus1.practice();
		
		System.out.println(mus2.getName() + ":");
		
		mus2.perform();
		mus2.playInstrument();



		
	}
}
