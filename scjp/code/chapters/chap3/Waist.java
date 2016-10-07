
public class Waist {
   WaistSize size;
   public static void main(String[] args) {
       Waist w1 = new Waist();
       Waist w2 = new Waist();
       w1.size = WaistSize.SMALL;
       w2.size = WaistSize.LARGE; 
      
       System.out.println(w1.size + " " + w2.size);
       System.out.println("Small size: " + w1.size.getSize());
      
  }
}

 enum WaistSize {
       SMALL(30), MEDIUM(34), LARGE(40);
   
   private int size;    
   WaistSize(int size) {
     this.size = size;
   } 
   public int getSize() {
     return size;
   }
  }

