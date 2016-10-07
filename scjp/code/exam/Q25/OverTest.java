class OverTest extends MySuperClass{
   public static void main(String[] args){
       System.out.println("Hello");
   }
  private void mySuperMethod(int i){
    System.out.println("Not really super!");
  }

  void mySuperMethod(int i, int j){
    System.out.println("Not really super!");
  }
  int mySuperMethod(double d){
    System.out.println("Not really super!");
    return 2;
  }
  public void mySuperMethod(boolean i){
    System.out.println("Not really super!");
  }



} 
class MySuperClass {
 void mySuperMethod(boolean b){
    System.out.println("Super method!");
 }
}