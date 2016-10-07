
public class EnumColorTest {
   public static void main(String[] args) {
       Colors c = new Colors();
       c.color = Colors.ThreeColors.RED;
       System.out.println(c.color);
      
  }
}

 class Colors {
       enum ThreeColors {BLUE, RED, GREEN}
       ThreeColors  color;
 }

