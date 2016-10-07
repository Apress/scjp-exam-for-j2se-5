public class TestEncapsulateBad {
 public static void main(String[] args) {
   EncapsulateBad eb = new EncapsulateBad();
   System.out.println("Do you have headache? " + eb.headache);
 }
}
class EncapsulateBad {
  public boolean headache = true;
  public int doses = 0;
}