 class PrivateTest {
  // public int  myNumber = 10;
   private int  myNumber = 10;
   public int getMyNumber(){
     return myNumber;
   }
 }
 class SubPrivateTest extends PrivateTest {
    public void printSomething(){
     System.out.println (" The value of myNumber is " + this.myNumber);
      System.out.println (" The value returned by the method is " + this.getMyNumber());
    } 
}
 class TestPrivateTest{
    public static void main(String[] args) {
      SubPrivateTest spt = new SubPrivateTest();
      spt.printSomething(); 
  }
 }