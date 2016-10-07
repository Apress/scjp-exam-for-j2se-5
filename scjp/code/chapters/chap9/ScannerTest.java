import java.util.*;
public class ScannerTest {
   public static void main(String[] args)  {                         
      String input = "cheque from publisher um 2000 dollars um buy diet pepsi um and peanuts";
      Scanner sc = new Scanner(input);
     System.out.println("Parsing round 1:");
      System.out.println(sc.next());
      System.out.println(sc.next());
       System.out.println(sc.next());
      System.out.println(sc.next());
      int salary = sc.nextInt();
      System.out.println("Advance:" + salary);
      sc.useDelimiter("um");
      System.out.println(sc.next());
      System.out.println(sc.next());
      System.out.println(sc.next());
      sc.close();
      System.out.println("Parsing round 2:");
      sc = new Scanner(input).useDelimiter("um");
      while(sc.hasNext()){
        System.out.println(sc.next());
      }
      }
}
