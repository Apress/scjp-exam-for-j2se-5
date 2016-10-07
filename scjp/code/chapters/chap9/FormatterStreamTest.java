import java.util.*;
import java.io.*;
public class FormatterStreamTest {
   public static void main(String[] args) throws IOException {
       Formatter formatter = new Formatter("c:\\tmp\\formatterTest.txt");                        
       formatter.format("%c", 33);
       formatter.format("%8.2f", 420.23);
       formatter.format("%8.2f", new Double(4234.23));
       formatter.format("%5b", " ");
       formatter.format("%20d", 42042042);
       formatter.format("%,20d", 42042042);
       formatter.flush();
   }
}
