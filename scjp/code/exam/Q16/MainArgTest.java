class MainArgTest {
  static int i=1;
  static public void main(String... args){
     System.out.println(i+1);
  }
   static { i = 4;}
}