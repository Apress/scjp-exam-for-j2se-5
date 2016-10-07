public class TestEncapsulateGood {
 public static void main(String[] args) {
   EncapsulateGood eg = new EncapsulateGood();
   eg.setHeadache(false);
   System.out.println("Do you have headache? " + eg.getHeadache());
 }
}
class EncapsulateGood {
  private boolean headache = true;
  private int doses = 0;
  short x = -9;
    // x = -x;
  public void setHeadache(boolean isHeadache){
      this.headache = isHeadache;
  }
  public boolean getHeadache( ){
      return headache;
  }

}