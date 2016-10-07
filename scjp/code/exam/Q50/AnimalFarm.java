import java.util.*;
  public class AnimalFarm {
      public static void main(String [] args) {
      // insert code here
       ArrayList a = new ArrayList();
        speak(a);
       ArrayList<Cow> ac =  new ArrayList<Cow>(); 
        speak(ac);
    //   HashSet<Cow> ah =  new HashSet<Cow>(); 
     //  speak(ah);
    }

    public static void speak(List<Cow> c) {
             System.out.println("Animal sound!");
    }

  }
  class Animal { }
  class Cow extends Animal { }
  class Goat extends Animal{}
