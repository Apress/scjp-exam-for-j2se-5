 public class ExceptionHandle1{
        public static void main(String[] args) {
       int x = 15;
       int y = 0;
         try{
        System.out.println ("x/y: " + x/y);
         System.out.println("x*y: " + x*y);
          }
           catch  (ArithmeticException ae) {
           System.out.println("An exception occurred: " + ae);
         }
                System.out.println("x-y: "  + (x-y));
    }
   }