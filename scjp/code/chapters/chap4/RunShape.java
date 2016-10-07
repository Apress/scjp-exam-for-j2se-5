 abstract class Shape {
    abstract void draw();
    void message() {
        System.out.println("I cannot live without being a parent.");
    }
 }
  class Circle extends Shape {
    void draw() {
        System.out.println("Circle drawn.");
    }
  }
  class Cone extends Shape {
    void draw() {
        System.out.println("Cone drawn.");
    }
  }
  public class RunShape {
    public static void main(String[] args) {
        Circle circ = new Circle(); 
        Cone cone = new Cone();
         circ.draw();
         cone.draw();
         cone.message(); 
    }
 }