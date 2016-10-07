// Review Question 8. Designed to fail.
import java.io.*;
class ContinueTest {
  public static void main(String[] arg)
  {
      int i = 2;
     Outer: 
        if ( i < 5 ) {
              System.out.println("I: " + i);
              i++;
              continue Outer;
        }
 }
}
