import java.util.*;
public class FullGenericTest{
  public static void main(String[] args) {
      ArrayList<MyClass> myList = new ArrayList<MyClass>();
      Integer I1 = new Integer(1);
      MyClass<String, Integer> mc1 = new MyClass("ready", I1 );
      MyClass<String, Integer> mc2 = new MyClass("set", new Integer("2"));
      MyClass<String, Integer> mc3 = new MyClass("go", new Integer("3"));

      myList.add(mc1);
      myList.add(mc2);
      myList.add(mc3);
      MyClass mc = new MyClass();

      Iterator<MyClass> itr = myList.iterator();
      while(itr.hasNext()){
        mc = itr.next();
        Integer I = (Integer)mc.getS();
        int i = I.intValue();
        System.out.println(mc.getP() + " " + i);
      }
      

  }
}
class MyClass<P, S>{
  private P pvar;
  private S svar;
  MyClass(){}
  MyClass(P pvar, S svar){
     this.pvar=pvar;
     this.svar=svar;
  }
  public P getP(){
      return pvar;
  }
  public S getS(){
       return svar;
  }
 }

