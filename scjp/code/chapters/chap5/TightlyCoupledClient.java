
 public class TightlyCoupledClient{
     public static void main(String[] args) {
       TightlyCoupledServer server = new TightlyCoupledServer();
         server.x=5;  //should use a setter method
         System.out.println("Value of x: "  + server.x); //should use a getter method
      }
   }
   class TightlyCoupledServer {
       public int x = 0;  //should be private
   }