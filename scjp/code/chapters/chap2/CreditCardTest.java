
public class CreditCardTest {
 public static void main(String[] args){
   String creditCard = args[0].toUpperCase();
   if(creditCard.equals(AllowedCreditCard.VISA.getName())){
     System.out.println("Your credit card " + args[0] + " is accepted.");
   } else if (creditCard.equals(AllowedCreditCard.MASTER_CARD.getName())){
     System.out.println("Your credit card " + args[0] + " is accepted.");
   } else if (creditCard.equals(AllowedCreditCard.AMERICAN_EXPRESS.getName())){
     System.out.println("Your credit card " + args[0] + " is accepted.");
   } else {
      System.out.println("Sorry, we do not accept the credit card " + args[0] + " at this time.");
   }

 }
}

class AllowedCreditCard {
  protected final String card;
  
  public final static AllowedCreditCard VISA = new AllowedCreditCard("VISA");
  public final static AllowedCreditCard MASTER_CARD = new AllowedCreditCard("MASTER_CARD");
  public final static AllowedCreditCard AMERICAN_EXPRESS = new AllowedCreditCard("AMERICAN_EXPRESS");

  private AllowedCreditCard(String str){
     card=str;
  }
  public String getName(){
    return card;
  }
 }