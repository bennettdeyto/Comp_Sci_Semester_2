package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn implements Horse{
	private Horse[] spaces;
	
	public int findHorseSpace(String name){
		for(int i = 0; i < spaces.length; i++){
			if(spaces[i].getName().equals(names)){
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate(){
		for(int i = 0; i < spaces.length; i++){
			if(spaces[i] == null){
					for(int a = 0; a < spaces.length; a++){
						if(spaces[a] != null){
							spaces[i] = spaces[a];
							spaces[a] = null;
							break;
						}
					}
			}
		}
	}
	
}
