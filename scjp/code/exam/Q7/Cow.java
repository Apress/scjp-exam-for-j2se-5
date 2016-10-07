interface Animal {
    void saySomething();
}

   class farm {
     void setName(String name){};
 }

  interface Pasture extends Animal{void graze();}
   
   

 public class Cow implements Pasture  {
   public void graze() { }
   public void saySomething(){}
 }
