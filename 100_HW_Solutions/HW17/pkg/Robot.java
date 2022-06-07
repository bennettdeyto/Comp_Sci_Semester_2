package pkg;

public class Robot{
	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	private boolean forwardMoveBlocked(){
		if((pos >= hall.length - 1 && facingRight) || (pos <= 0 && !facingRight)){
			return true;
		}
		return false;
	}
	private void move(){
		if(facingRight){
				pos++;
				if(int[pos] > 0){
				int[pos] = int[pos] - 1;
				}
				if(forwardMoveBlocked){
					facingRight = false;
				}
		}
		else if(!facingRight){
				pos--;
				if(int[pos] > 0){
					int[pos] = int[pos] - 1;
				}
				if(forwardMoveBlocked){
					facingRight = true;
				}
		}
		
	}
	public int clearHall(){
		int numMoves = 0;
		while(!hallisClear()){
			numMoves++;
			move();
		}
		return numMoves;
	}
	private boolean hallIsClear(){
		
	}
	
}
