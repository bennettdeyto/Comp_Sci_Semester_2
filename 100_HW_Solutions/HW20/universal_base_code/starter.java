
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList <Integer> bubble = new ArrayList <Integer>();
		ArrayList <Integer> selection = new ArrayList <Integer>();
		ArrayList <Integer> insertion = new ArrayList <Integer>();
		
		for(int i = 0; i < 100; i++){
			int num = (int)(Math.random()*100);
			bubble.add(num);
			selection.add(num);
			insertion.add(num);
		}
		System.out.println("-----------------ORIGINAL (3 ARRAYLISTS)-----------------");
		System.out.println(bubble);
		System.out.println();
		
		//bubble
		
		for(int outa = 0; outa < bubble.size() - 1; outa++){
			for(int ina = 0; ina < bubble.size() - outa - 1; ina++){
				if(bubble.get(ina) > bubble.get(ina + 1)){
					int temp = bubble.get(ina);
					bubble.set(ina, bubble.get(ina + 1));
					bubble.set(ina + 1, temp);
				}
			}
		}
		
		//selection
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
		
		
		//insertion
		
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
		
		
		int median = bubble.get(bubble.size()/2);
		
		
		System.out.println("-----------------WITH BUBBLE-----------------");
		System.out.println(bubble);
		System.out.println();
		System.out.println("-----------------WITH SELECTION-----------------");
		System.out.println(selection);
		System.out.println();
		System.out.println("-----------------WITH INSERTION-----------------");
		System.out.println(insertion);
		System.out.println();
		System.out.println();
		System.out.println("The Median of the ArrayList is: " + median);
		
	}
}
