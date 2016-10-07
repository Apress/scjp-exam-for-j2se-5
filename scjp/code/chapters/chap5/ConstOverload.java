
 public class ConstOverload{
     public static void main(String[] args) {
       new A();
     }
   }
  class A {
        int x=0;
   A(){
          this(5);
          System.out.println("A() ");
      }
   A(int i){
  //      this();
          System.out.println(i);  
   }
}