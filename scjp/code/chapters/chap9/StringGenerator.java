public class StringGenerator{
  public static void main(String[] args){    
  char[] chara = {'I','4','U'};
  String s1 = new String(chara);
  String s2 = new String("I4U");
  String s3 = "I4U";
  String s23 = new String("I4U" + "U4I");
  String s32 = "I4U" + "U4I";
  double d = 12.34;
  String s123 = "I4U" + d;

  System.out.println("s1: " + s1 + "s2: " + s2 + "s3: " + s3);
  System.out.println("s23: " + s23 + "s32: " + s32);
  System.out.println("s123: " + s123);



    }
}
