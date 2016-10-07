import java.io.*;

public class FileByteCopier {
    public static void main(String[] args) throws IOException {
	File inputFile = new File("scjp.txt");
	File outputFile = new File("scjpcopy.txt");

        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;

        while ((c = in.read()) != -1)
           out.write(c);

        in.close();
        out.close();
    }
}





