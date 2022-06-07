import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		double rand1 =  Math.floor(Math.random() * 9);
		double rand2 = Math.floor(Math.random() * 100) + 1;
		double rand3 = Math.random() + 2.5;
		double rand4 = Math.random() * 575 + 14;
		
		System.out.println("A random number between 0 and 9 is " +rand1);
		System.out.println("A random number between 1 and 100 is " +rand2);
		System.out.println("A random number between 2.5 and 3.5 is " +rand3);
		System.out.println("A random numver between 14 abd 589 is " +rand4);
	}
}
