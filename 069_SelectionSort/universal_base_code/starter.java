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
	public static void selectionSort(ArrayList <Integer> selection){
		int out, in, min_index;
			
			for(out = 0; out < selection.size(); out++){
				min_index = out;
				for(in = out + 1; in < selection.size(); in++){
					if(selection.get(in) < selection.get(min_index)){
						min_index = in;
					}
				}
				int temp = selection.get(out);
				selection.set(out, selection.get(min_index));
				selection.set(min_index, temp);
			}
		}
	}
