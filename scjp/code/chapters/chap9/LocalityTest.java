import java.util.*;
class LocalityTest {
 public static void main(String[] args){
   
      Locale india= new Locale("pa", "IN");
      Locale unitedStates = new Locale("en", "US");
      Locale america = Locale.US;
      Locale english = new Locale("en");

      if(unitedStates.equals(america)){
         System.out.println("For some folks, America means United States!");
      }
      if(unitedStates.equals(india)){
        System.out.println("There is some bug in the code!"); 
      }else {
        System.out.println("The fact that Columbus stumbled into America when he was looking for India does not make America and India equal!"); 
      }

      System.out.println("The default Locale of this JVM is: "+ Locale.getDefault()); 

      System.out.println("The default language for this instance of India is: "+ india.getLanguage()); 
      System.out.println("The display anguage for this instance of India is: "+ india.getDisplayLanguage()); 
      System.out.println("The display name for this instance of US: "+ america.getDisplayName()); 

 }
}