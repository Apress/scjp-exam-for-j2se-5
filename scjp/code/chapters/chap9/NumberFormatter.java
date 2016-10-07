import java.util.*;
import java.text.*;
class NumberFormatter{
 public static void main(String[] args){
   

     // Double amount = new Double(1276789.34);
     
      double amount = 1276789.34;
      double percent = 0.95;

      Locale india= new Locale("en", "IN");
      Locale america = new Locale("en", "US");
      Locale germany = new Locale("de", "DE");
      
      

      NumberFormat nfIndia = NumberFormat.getNumberInstance(india);
      NumberFormat nfAmerica = NumberFormat.getNumberInstance(america);
      NumberFormat nfGermany = NumberFormat.getNumberInstance(germany);
         
      System.out.println(nfIndia.format(amount));
      System.out.println(nfAmerica.format(amount));
      System.out.println(nfGermany.format(amount));
   
      nfIndia = NumberFormat.getCurrencyInstance(india);
      nfAmerica = NumberFormat.getCurrencyInstance(america);
      nfGermany = NumberFormat.getCurrencyInstance(germany);
      
      System.out.println(nfIndia.format(amount));
      System.out.println(nfAmerica.format(amount));
      System.out.println(nfGermany.format(amount));

      
      nfIndia = NumberFormat.getPercentInstance(india);
      nfAmerica = NumberFormat.getPercentInstance(america);
      nfGermany = NumberFormat.getPercentInstance(germany);
      
      System.out.println(nfIndia.format(percent));
      System.out.println(nfAmerica.format(percent));
      System.out.println(nfGermany.format(percent));


 }
}