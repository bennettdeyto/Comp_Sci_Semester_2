import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <String> cookies = new ArrayList <String>();
		
		System.out.print("How many cookies would you like? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++){
			cookies.add("Cookie");
		}
		
		System.out.println(cookies);

		
	}
}
