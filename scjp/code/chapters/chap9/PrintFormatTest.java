import java.io.*;
public class PrintFormatTest {
   public static void main(String[] args) throws IOException {
       
       PrintWriter pw = new PrintWriter("C:\\temp\\writerTest.txt");                          
       pw.format("%c", 33);
       pw.format("%8.2f", 420.23);
       pw.format("%8.2f", new Double(4234.23));
       pw.format("%5b", " ");
       pw.format("%20d", 42042042);
       pw.format("%,20d", 42042042);
       pw.flush();
   }
}
