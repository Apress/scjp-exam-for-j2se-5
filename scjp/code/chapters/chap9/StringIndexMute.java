public class StringIndexMute{
  public static void main(String[] args){
    StringBuilder str = new StringBuilder("0123 456 ");
      if (str.length() == 9)
       str.insert(9, "abcde");
       str.delete(2,5);
       System.out.println(str.indexOf("d"));
       System.out.println(str);

    }
}
