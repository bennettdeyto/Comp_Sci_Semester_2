import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   
   
   public void add(String maker, boolean electronic, int num){
      purchases.add(new Gizmo(maker, electronic, num))
   }
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
      int min = 99999999;
      int pos;
   	for(int i = 0; i < purchases.size(); i++){
   	   if(purchases.get(i).getCost() < min){
   	      pos = i;
   	      min = purchases.get(i).getCost();
   	   }
   	}
   	return purchases.get(pos);
   }
   
   public int countElectronicsByMaker( String mkr ){
      int num = 0;
      for(int i = 0; i < purchases.size(); i++){
         if(purchases.get(i).getMaker().equals(mkr) && isElectronic){
            num++;
         }
      }
      return num;
   }
   
   public boolean hasAdjacentEqualPair(){
      if(purchases.size() < 2){
         return false;
      }
      for(int i = 1; i < purchases.size(); i++){
         if(purchases.get(i - 1).equals(purchases.get(i))){
            return true;
         }
      }
      return false;
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
