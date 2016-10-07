
public class MyMainTest{
  public static void main(String[] args) throws Exception{
       assert (true): " Assert";
       System.out.print(" After ");
       Test().main("Hello");
 }
}

class Test {
  Test(){
     System.out.print(" Constructor");
  }
  public static void main(String[] args) {
       System.out.print(args[0]);
 }
}

