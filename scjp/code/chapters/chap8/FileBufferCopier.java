import java.io.*;

public class FileBufferCopier {
    public static void main(String[] args) throws IOException {
	File inputFile = new File("scjp.txt");
	File outputFile = new File("scjpcopy.txt");

      BufferedReader in = new BufferedReader(new FileReader(inputFile));
      BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
 
      String line; 
      while ((line = in.readLine()) != null){
       out.write(line);
       out.newLine();
      }

      in.close();
      out.close();
    }
}





