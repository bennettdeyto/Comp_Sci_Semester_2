import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		printValuesInt(arr1);
		selectionSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*10));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void selectionSort(ArrayList <Integer> insertion){
		int outer, inner, key;
		
		for(outer = 1; outer < insertion.size(); outer++){
			key = insertion.get(outer);
			inner = outer - 1;
			
			while(inner >= 0 && insertion.get(inner) > key){
				insertion.set(inner + 1, insertion.get(inner));
				inner--;
			}
			insertion.set(inner + 1, key);
		}
			}
		}
