
public class StringFormatTest {
   public static void main(String[] args)  {                         
       System.out.println(String.format("%c", 33));
       System.out.println(String.format("%8.2f", 420.23));
       System.out.println(String.format("%8.2f", new Double(4234.23)));
       System.out.println(String.format("%5b", " "));
       System.out.println(String.format("%20d", 42042042));
       System.out.println(String.format("%,20d", 42042042));
   }
}
