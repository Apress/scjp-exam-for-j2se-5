import java.util.*;
 
 public class StateFair {
  public static void main (String[] args) {
     Set<Animal> animals = new HashSet<Animal>();
     Set<Cow> calCow = new HashSet<Cow>();
     Set<Object> wisCow = new HashSet<Object>();
     talkingAnimals(animals);
     talkingAnimals(calCow);
     talkingAnimals(wisCow);
   }
   //  insert code here
       public static void talkingAnimals(Set<? extends Object> set) {
                  System.out.println("The animal talk!");
      } 
   }
class Animal { }
class Cow extends Animal{ }