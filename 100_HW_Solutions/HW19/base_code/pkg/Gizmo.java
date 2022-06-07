package pkg;

public class Gizmo
{ 
   String mkr;
   boolean electronic;
   double cost;
   
   Gizmo(String maker, boolean electronic, double cost){
      this.mkr = maker;
      this.electronic = electronic;
      this.cost = cost;
   }
   
   public double getCost(){
      return cost;
   }
   
   public String getMaker(){
      return mkr;
   }
   
   public boolean isElectronic(){
      return electronic;
   }
   
   public boolean equals(Object obj){
      if(obj != null && obj instanceof Gizmo){
         if(this.mkr.equals((Gizmo)obj).getMaker() && this.electronic == ((Gizmo)obj).isElectronic() && this.cost == ((Gizmo)obj).getCost()){
            return true;
         }
      }
      return false;
   }
   public String toString()
   {
   	return "" + maker + " " + isElectronic + " " + cost;
   }
}
