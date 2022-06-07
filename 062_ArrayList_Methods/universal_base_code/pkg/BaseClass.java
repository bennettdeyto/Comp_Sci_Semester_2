package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public void toStringArrayList(ArrayList<Double> arr){
    System.out.print("{");
	for(int i = 0; i < arr.size(); i++){
	   System.out.print(arr.get(i) + " ");
	}
	System.out.println("}");
	return;
}
public int getArrayListAverage(ArrayList<Double> arr){
    int sum = 0;
    for(int i = 0; i < arr.size(); i++){
	    sum = sum + (int)i;
	}
	return sum/arr.size();
}
public int getArrayListMax(ArrayList<Double> arr){
    int max = 0;
    for(int i = 0; i < arr.size(); i++){
	    if(arr.get(i) > max){
	        max = arr.get(i);
	    }
	}
	return max;
}
public int getArrayListMin(ArrayList<Double> arr){
    int min = 99999999;
    for(int i = 0; i < arr.size(); i++){
	    if(arr.get(i) < min){
	        min = arr.get(i);
	    }
	}
	return min;
}