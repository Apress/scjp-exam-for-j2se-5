import java.io.*;
class MyCar extends Vehicle {
    int speed = 0;
    int year = 1960;
    int price =0;
   public static void main(String [] args) {    
     
     System.out.println("There comes my car"); 
  }

  int getPrice(int i){
           return price;
   }
  
  int getYear(int i)throws NullPointerException {
           return year;
   }

    int getSpeed (int i) throws IOException  {
       return speed;
     }
}

class Vehicle {
   int getPrice(int i) throws IOException {
           return 50000;
   }

   int getYear(int i){
           return 1990;
   }

  int getSpeed(int i){
           return 60;
   }
}

