public class TestPoly {
 public static void main(String [] args) {
  Animal heyAnimal = new Animal();
  Cow c = new Cow();
  Buffalo b = new Buffalo();
  heyAnimal=c;
  heyAnimal.saySomething();
  heyAnimal=b;
  heyAnimal.saySomething();
 }
}
class Animal {
  public void saySomething() {
     System.out.println("Umm...");
  }
}
class Cow extends Animal {
  public void saySomething() {
     System.out.println("Moo!");
  }
}
class Buffalo extends Animal{
  public void saySomething() {
     System.out.println("Bah!");
  }
}