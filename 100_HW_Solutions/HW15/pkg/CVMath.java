package pkg;

public class CVMath {		
	public static void specialSquare(int n){
		int numspecsqs = 0;
		int count = 0;
		
		while(numspecsqs<n){
			boolean specsq = false;
			
			count++;
			// System.out.println(count);
			
			for(int i = 1, sum = 0; sum < count; i++){
				
				sum = sum + i;
				
				if(sum == count && count != 1){
					specsq = true;
					break;
				}
			}
			
			if((Math.sqrt(count) % 1) == 0 && specsq){
				System.out.println(count);
				numspecsqs++;
			}
			
		}
		
	}
	
}
