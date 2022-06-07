package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable{
	public SingleTable t1;
	public SingleTable t2;
	
	public CombinedTable(SingleTable t1, SingleTable t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public boolean canSeat(int num){
		if(num <= (t1.getNumSeats() + t2.getNumSeats()) - 2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public double getDesirability(){
		double desirability;
		if(t1.getHeight() == t2.getHeight()){
			desirability = (t1.getViewQuality() + t2.getViewQuality())/2;
		}
		else{
			desirability = ((t1.getViewQuality() + t2.getViewQuality())/2) - 10;
		}
		return desirability;
	}
	
}