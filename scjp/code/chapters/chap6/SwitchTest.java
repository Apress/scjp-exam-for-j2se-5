
class SwitchTest {
  public static void main(String[] args)
  {
     Signal sig = Enum.valueOf(Signal.class, args[0].toUpperCase());
     switch(sig){
      case RED:
          sig.redSays();
          break;
      case YELLOW:
          sig.yellowSays();
      case GREEN:
          sig.greenSays();
     }
 }
}

enum Signal {RED, YELLOW, GREEN;
  public void redSays(){
       System.out.println("STOP");
  }
  public void yellowSays(){
       System.out.println("STOP if it is safe to do so.");
       System.out.println("Otherwise");
  }
  public void greenSays(){
       System.out.println("Keep going.");
  }

}
