public class ExceptionHandle2{ 
   public static void main(String[] args) { 
      int x = 15; 
      int y = 0; 
       try{ 
           System.out.println ("x/y: " + x/y); 
           System.out.println("x*y: " + x*y); 
           }catch(ArrayIndexOutOfBoundsException oe) { 
           System.out.println("An exception occurred: " + oe); 
          } 
          finally { 
            System.out.println("finally block must be executed!"); 
          } 
           System.out.println("x-y: " + (x-y)); 
    }
  }