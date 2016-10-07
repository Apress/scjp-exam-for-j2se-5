 class MyClass {
  // public int  myNumber = 10;
   private int  myNumber = 10;
   public int getMyNumber(){
     return myNumber;
   }
 }
 class InstanceTest {
    public static void main(String[] args) {
      MyClass  mc = new MyClass();
      System.out.println (" The value of myNumber is " + mc.myNumber);
      System.out.println (" The value returned by the method is " + mc.getMyNumber());
   }
 }