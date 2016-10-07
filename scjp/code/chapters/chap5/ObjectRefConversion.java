
 public class ObjectRefConversion{
   public static void main(String[] args) {
         ClassRoom[] crooms = new ClassRoom[10];
         Room[] rooms; 
         Lab[]  labs;
       for (int i = 0; i<5; i++) {
          crooms[i] = new ClassRoom();
       }
         rooms = crooms;
         labs = crooms;  // compiler error
   }
 }
 
 interface Facilities {
 }

 class Room {
 }
 
 class ClassRoom  extends Room implements Facilities{
 } 

 class Lab extends ClassRoom {
 }

  