 public class MultipleExceptions{
        public static void main(String[] args) {
       int[] x = {0, 1, 2, 3, 4};
         try{
          System.out.println ("x[6]: " + x[6]);
          System.out.println("x[3]: " + x[3]);
          }
         catch (ArithmeticException ae) { 
         System.out.println("An arithmetic exception occurred: " + ae); 
        } 
         catch (ArrayIndexOutOfBoundsException oe) {
           System.out.println("Array index out of bound! ");
         }  
         catch  (IndexOutOfBoundsException ie) {
           System.out.println("Some kind of index out of bound! ");
         }
         finally {
              System.out.println("finally block must be executed!");
         }
                System.out.println("x[0]: "  + x[0]);
        }
    }