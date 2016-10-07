//import java.io.*;
class AllMyExceptions {
   
   public static void main(String [] args) {    
     try {
        System.out.println(Double.valueOf("420.00"));
     }catch (Exception e) {
               System.out.println("Some exception!");
     }catch (NumberFormatException ne) {
               System.out.println("Number format exception!");
     }
    
    System.out.println("All My Exceptions!"); 
  }
 }

