package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics{
	
	public static int factorial(int n){
		int product = n;
		int i = 1;
		while(i < n){
			product = product * (product - i);
			i++;
		}
		return product;
	}
	
	public static void numCombinations(int n, int r){
		int numCombos;
		if(r > n){
			System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices");
		}
		else{
			numCombos = factorial(n)/(factorial(r) * factorial(n - r));
			System.out.println("There are " + numCombos + " ways of choosing " + r + " items from " + n + " choices");
		}
	}
}
