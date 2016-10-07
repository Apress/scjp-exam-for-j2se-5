import java.util.*;
public class NonGenericTest{
  public static void main(String[] args) {
      ArrayList myList = new ArrayList();
      String st = "Hello";
      myList.add(st);
      String st1 = (String) myList.get(0);
      System.out.println(st1);

      Iterator itr = myList.iterator();
      while(itr.hasNext()){
        String st2 = (String) itr.next();
        System.out.println(st2);
      }
  }
}

