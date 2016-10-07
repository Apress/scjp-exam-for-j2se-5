import java.util.*;
import java.io.*;
public class FormatterTest {
   public static void main(String[] args) throws IOException {
       Formatter formatterToFile = new Formatter("c:\\tmp\\formatterTest.txt"); 
       Formatter formatter = new Formatter();                         
       System.out.println(formatter.format("%c", 33).toString());
       System.out.println(formatter.format("%8.2f", 420.23).toString());
       System.out.println(formatter.format("%8.2f", new Double(4234.23)).toString());
       System.out.println(formatter.format("%5b", " ").toString());
       System.out.println(formatter.format("%20d", 42042042).toString());
       System.out.println(formatter.format("%,20d", 42042042).toString());
       System.out.println(formatter.toString());
       formatter = formatterToFile;
       formatter.flush();
   }
}
