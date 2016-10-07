import java.io.*;

public class FileCharCopier {
    public static void main(String[] args) throws IOException {
	File inputFile = new File("scjp.txt");
	File outputFile = new File("scjpcopy.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;

        while ((c = in.read()) != -1)
           out.write(c);

        in.close();
        out.close();
    }
}





