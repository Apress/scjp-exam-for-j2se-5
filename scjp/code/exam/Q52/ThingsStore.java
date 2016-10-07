import java.util.*;
 class ThingsStore {
   public static void main(String [] args) {
     ArrayList<Things> al = new ArrayList<Things>();
     al.add(new Things(1));
     al.add(new Things(2));
     System.out.println(al.size());
 } 
  
} 
class Things implements Comparator{
   int i; 
   Things(int s) { this.i = s; }
   public int compareTo(Object o) { return this.i - ((Things)o).i; }
 }

