public class ConversionMachine{
 public static void main(String[] args){
      Byte b = 4;
      Byte wbyte = new Byte(b);
      double d = 354.56d;
      Double wdouble = new Double(d);
      System.out.println("wrapped Inside Byte: " + b);
      System.out.println("double value extracted from Byte: " + wbyte.doubleValue());
      System.out.println("Wrapped Inside Double: " + d);
    System.out.println("byte value extracted from Double: " + wdouble.byteValue());
 }
}

