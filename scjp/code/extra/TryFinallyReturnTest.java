 
public class TryFinallyReturnTest {
     public static void main(String[] args){
         int x=0;
         try{
            System.out.println ("I was in try");
             if(x==0)throw new ClassCastException("Honey, I blew up the class!");
         }
         catch (ClassCastException ce){
              System.out.println("I was in catch!");
         //     throw ce;
          //    return;
         } 
         finally {
         // if(x==0) return;
           System.out.println("In Finally!");
        }
            System.out.println("After finally!");
    }
 }