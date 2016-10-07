import java.io.*;
public class ReadWriteDataTest {
 public static void main(String[] args) throws IOException {
   String dataFile = "orders.txt";
  DataOutputStream out = new DataOutputStream(new FileOutputStream(dataFile));
        double[] priceList = { 19.99, 29.99, 39.99};
        int[] copies = { 100000, 50000,70000};
        String[] titleList = { "SCJP Study Guide",
			   "SCBCD Study Guide",
			   "SCSA Study Guide"};
       // Write out into the file. 
        for (int i = 0; i < priceList.length; i++) {
            out.writeDouble(priceList[i]);
            out.writeChar('\t');
            out.writeInt(copies[i]);
            out.writeChar('\t');
            out.writeChars(titleList[i]);
            out.writeChar('\n');
        }
        out.close();

        // read back in again
        DataInputStream in = new DataInputStream(new FileInputStream(dataFile));
        double price;
        int copy;
        StringBuffer title;
        double grandTotal = 0.0;

        try {
            while (true) {
                price = in.readDouble();
                in.readChar();       // throws out the tab
                copy = in.readInt();
                in.readChar();       // throws out the tab
		char ch;
		title = new StringBuffer(25);
		char lineSep = System.getProperty("line.separator").charAt(1);
		while ((ch = in.readChar()) != lineSep)title.append(ch);
                System.out.println("Your order: " + copy + " copies of " + title + " at $" + price);
                grandTotal = grandTotal + copy * price;
            }
        } catch (EOFException e) {
               System.out.println("End of File!");
        }
        System.out.println("Grand Total: $" + grandTotal);
        in.close();
    }
}

