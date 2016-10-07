import java.util.regex.*;
public class SplitTest {
   public static void main(String[] args)  {
       String input= "www.cs.cornell.edu";                          
     
      Pattern p = Pattern.compile("\\.");
      String pieces[] = p.split(input);
      for (int i=0; i<pieces.length; i++){
            System.out.println(pieces[i]);    
            }


      
   }
}
