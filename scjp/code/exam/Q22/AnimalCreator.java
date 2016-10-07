class AnimalCreator {
 public static void main(String [] args) {
    Animal [] animals = {new Animal(), new Cow()};
    for (Animal a : animals){
       Animal x = a.getAnimal();
       System.out.println(x);
    }
  }
 }

 class Animal { 
    Animal getAnimal() { 
       return new Animal(); 
    }
 }
 
 class Cow extends Animal { 
     // Cow getAnimal () { return new Cow();} 
      Animal getAnimal() {return new Cow();}
 }
