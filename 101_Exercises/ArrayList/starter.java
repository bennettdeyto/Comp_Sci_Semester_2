import java.util.*;

class starter {
	//Methods go here
	
	public static void printArrayList(ArrayList <Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i));
		}
		return;
	}
	
	public static void addValuesArrayList(int n, ArrayList <Integer> arr){
		for(int i = 0; i < n; i++){
			arr.add((int)(Math.random() * 100));
		}
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many values would you like? ");
		int num = sc.nextInt();
		
		ArrayList <Integer> arr = new ArrayList <Integer>();
		addValuesArrayList(num, arr);
		printArrayList(arr);



	}
}
