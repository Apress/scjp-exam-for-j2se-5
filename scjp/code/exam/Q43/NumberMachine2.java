import java.text.*;
class NumberMachine2{
      public static void main(String [] args) {
        //  NumberFormat nf = new NumberFormat();

        NumberFormat nf = NumberFormat.getInstance();
       nf.setMaximumIntegerDigits(2);
               System.out.println((String) nf.format(420.101));
      }
     }

