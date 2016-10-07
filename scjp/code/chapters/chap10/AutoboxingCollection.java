import java.util.*;
public class AutoboxingCollection{
  public static void main(String[] args) {
      HashMap<String, Integer> hm = new HashMap<String, Integer>();
      for (String word : args) {
          Integer freq = hm.get(word);
          hm.put(word, (freq == null ? 1 : freq + 1));
      }
      System.out.println(hm);
   }
}



