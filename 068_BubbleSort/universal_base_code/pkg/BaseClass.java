package pkg;
import java.util.Scanner;
import java.util.Random;


public void bubbleSort(ArrayList <Integer> bubble){
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

