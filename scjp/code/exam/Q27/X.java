class X extends Y implements I { 
   public void goBear(){
      System.out.println("Go Bear go!"); 
   }
}
class Y {
  Z z=new Z(); 
}
interface I { 
  public void goBear(); 
}
class Z { }
