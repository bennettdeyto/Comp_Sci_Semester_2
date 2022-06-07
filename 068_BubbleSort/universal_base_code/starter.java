import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		printValuesInt(arr1);
		bubbleSort(arr1);			//Create this method
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
	public static void bubbleSort(ArrayList <Integer> bubble){
	for(int outer = 0; outer < bubble.size() - 1; outer++){
			for(int inner = 0; inner < bubble.size() - outer - 1; inner++){
				if(bubble.get(inner) > bubble.get(inner + 1)){
					int temp = bubble.get(inner);
					bubble.set(inner, bubble.get(inner + 1));
					bubble.set(inner + 1, temp);
				}
			}
		}
	}
}
