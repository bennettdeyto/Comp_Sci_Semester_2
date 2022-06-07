import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] performers = new Performer[4];
		performers[0] = new Performer();
		performers[1] = new Musician();
		performers[2] = new Apprentice();
		performers[3] = new Musician();
		
		System.out.println(performers[0].toString());
		System.out.println(performers[1].toString());
		System.out.println(performers[2].toString());
		System.out.println(performers[3].toString());
		System.out.println(performers[1].equals(performers[3]));

		
	}
}
