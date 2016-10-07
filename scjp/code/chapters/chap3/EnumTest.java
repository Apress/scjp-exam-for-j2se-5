
public class EnumTest {
   public static void main(String[] args) {
       int nargs=args.length;
       if(nargs < 1){
          System.out.println("There must be an argument in the command: UP, DOWN, STRANGE, CHARM, TRUTH, or BEAUTY");
          System.out.println("Example: java EnumTest BEAUTY");
          System.exit(0);
       }else {
          
          Quark q = Enum.valueOf(Quark.class, args[0].toUpperCase());
          char symbol = q.getSymbol();
          double charge = q.getCharge();  
          System.out.println("The electric charge for quark " + symbol + ": " + charge);
          System.out.println("The name of the quark: " + q.name());
       }
      
  }
}

enum Quark {
  UP('u', 2.0/3.0),
  DOWN('d', -1.0/3.0),
  CHARM('c', 2.0/3.0),
  STRANGE('s', -1.0/3.0),
  TRUTH('t', 2.0/3.0),
  BEAUTY('b', -1.0/3.0);

  private final char symbol;
  private final double charge;
  Quark(char symbol, double charge){
       this.symbol = symbol;
       this.charge = charge;
  }
  public char getSymbol(){
    return symbol;
  } 
  public double getCharge(){
    return charge;
  } 
}