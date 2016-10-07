import java.util.*;
class EqualTest {
 private static String[] partyTime = {"on", "off"};
 public static void main(String[] party){
     
    if(Arrays.equals(partyTime, party))
      System.out.println("Party is on!");

    if(party==partyTime)
      System.out.println("Party is over!");
 }
}