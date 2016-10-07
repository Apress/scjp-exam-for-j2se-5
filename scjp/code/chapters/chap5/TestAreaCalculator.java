
class TestAreaCalculator {
public static void main(String[] args) {
     AreaCalculator ac = new AreaCalculator();
     System.out.println("Area of a rectangle with length 2.0, and width 3.0: " + ac.calculateArea(2.0f, 3.0f));
     System.out.println("Area of a triangle with sides 2.0, 3.0, and 4.0: " + ac.calculateArea(2.0, 3.0, 4.0));
     System.out.println("Area of a circle with radius 2.0: " + ac.calculateArea(2.0));
}
}

class AreaCalculator {
  float  calculateArea(float length, float width) {
      return length*width;
  }
  double calculateArea(double radius) {
      return ((Math.PI)*radius*radius);
  }
  double  calculateArea(double a, double b, double c) {
      double s = (a+b+c)/2.0;
      return  Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
}