import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	private int[] rateTable;
	
	private int getChargingCost(int startHour, int chargeTime){
		int cost = 0;
		for(int i = startHour; i - startHour < chargeTime, i++){
			cost = cost + rateTable[i];
		}
		return cost;
	}
	
	public int getChargeStartTime(int chargeTime){
		int index;
		int minCost = 9999999999;
		for(int i = 0; i < rateTable.length; i ++){
			if(getChargingCost(i, chargeTime) < minCost){
				minCost = getChargingCost(i, chargeTime);
				index = i;
			}
		}
		return index;
	}
}
