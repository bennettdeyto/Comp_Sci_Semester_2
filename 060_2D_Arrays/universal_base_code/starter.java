import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows would you like?");
		int xp = sc.nextInt();
		System.out.println("How many columns would you like?");
		int yp = sc.nextInt();
		double[][] arr = new double[xp][yp];
		double sum = 0;
		for(int x = 0; x < arr.length; x++){
			for(int y = 0; y < arr[0].length; y++){
				arr[x][y] = ;
				System.out.print(arr[x][y] + " ");
				sum = sum + arr[x][y];
				}
			System.out.println("");
		}
		double avg = sum/arr.length * arr[0].length;
		System.out.println(avg);
		
	}
}
