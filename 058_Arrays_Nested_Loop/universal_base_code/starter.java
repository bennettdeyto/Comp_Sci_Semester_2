import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What symbol would you like to use? ");
		String p = sc.nextLine();
		System.out.print("What is the width of your box? ");
		int width = sc.nextInt();
		System.out.print("What is the height of your box? ");
		int height = sc.nextInt();
		for(int x = 0; x < height; x++){
			for(int y = 0; y < width; y++){
				System.out.print(p);
				}
			System.out.println("");
		}


		
	}
}
