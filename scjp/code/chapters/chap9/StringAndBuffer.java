public class StringAndBuffer{
  public static void main(String[] args) {
     String sl = "String literal!";
     String sn = new String("String new");
     StringBuffer sb = new StringBuffer ("String buffer");
     sl.concat(" Ya!");
     sn.concat(" Ya!");
     sb.append(" Ya!");
     
       
     System.out.println("sl after concat(): " + sl);
     System.out.println("sn after concat(): " + sn);
     System.out.println("sb after append(): " + sb);



    }
}
