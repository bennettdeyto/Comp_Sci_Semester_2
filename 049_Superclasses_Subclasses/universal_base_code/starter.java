import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer per1 = new Performer();
		Performer per2 = new Performer("Jack", 23);
		
		Musician mus1 = new Musician();
		Musician mus2 = new Musician("Guitar");
		
		System.out.println(per1.getName());
		per1.practice();
		
		System.out.println("");
		
		System.out.println(per2.getName());
		per2.perform();
		
		System.out.println("");
		
		System.out.println(mus1.getName());
		mus1.perform();
		mus1.playInstrument();
		
		System.out.println("");
		
		mus2.practice();
		mus2.playInstrument();



		
	}
}
