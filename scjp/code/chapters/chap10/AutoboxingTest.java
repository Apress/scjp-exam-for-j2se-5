import java.util.*;
public class AutoboxingTest{
  public static void main(String[] args) {
     Integer wi1 = 1;
     wi1++;
     Integer  wi2 = 2;
     if(wi1==wi2){
       System.out.println("Area: " + areaOfASquare(4.0d));
     }
      
  }
public static Double areaOfASquare(Double side){
        return side*side;
}


}

