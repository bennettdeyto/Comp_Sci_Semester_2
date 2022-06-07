import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Double> arr = new ArrayList <Double>();
		
		System.out.print("How many values would you like? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++){
			arr.add(Math.random() * 10);
		}
		
		System.out.println(toStringArrayList(arr));
		System.out.println(" ");
		System.out.println("The maximum of this array is " + getArrayListMax(arr));
		System.out.println("The minimum of this array is " + getArrayListMin(arr));
		System.out.println("The average of this array is " + getArrayListAverage(arr));
		
	}
}
