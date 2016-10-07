 public class AssertionExample{ 
   public static void main(String[] args) { 
      int x = 15; 
      DataAccess da = new DataAccess(); 
      assert da.dataIsAccesible():"Data is not acceptable"; 
      System.out.println("Value of x: " + x); 
   } 
 } 
 class DataAccess { 
  public boolean dataIsAccesible(){ 
    return false; 
  }  
 }
