import java.io.*;
public class AnimalFarm implements Serializable {
 public static void main(String[] args) {
     Cow cow = new Cow();
     Goat goat = new Goat();  
     System.out.println("This farm can be serilaized");   
  }
 }
class Cow implements Serializable {}
class Goat {}
