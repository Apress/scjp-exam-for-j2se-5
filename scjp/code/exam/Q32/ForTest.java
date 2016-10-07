
  import java.util.*;
   class ForTest {
     static List list = new ArrayList();
     static List getList() { return list; }
    public static void main(String [] args) {
     list.add("Ready"); list.add("Set"); list.add("Go");
      // insert code here
      for (Object obj:getList())
      System.out.print(obj);
    }
  }


