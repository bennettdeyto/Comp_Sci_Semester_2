import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		double[][] arr = new double[5][4];
		double sum = 0;
		for(int x = 0; x < arr.length; x = x++){
			for(int y = 0; y < arr[0].length; y++){
				arr[x][y] = Math.random() * 10;
					sum = sum + arr[x][y];
				}
		}
		double avg = sum/arr.length * arr[0].length;
		System.out.println(avg);
	}
}
