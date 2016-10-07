import java.io.*;
class Animal implements Serializable {}

class Cow extends Animal{
     Milk m = new Milk();
   }
   class Milk implements Serializable {
     SaturatedFat sf1 = new SaturatedFat();
     SaturatedFat sf2 = new SaturatedFat();
     SaturatedFat sf3 = new SaturatedFat();
   }

   class SaturatedFat implements Serializable { }
