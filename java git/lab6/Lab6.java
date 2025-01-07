// Develop a Java program to create an abstract class named Shape that contains two integers
// and an empty method named printArea( ). Provide three classes named Rectangle, Triangle
// and Circle such that each one of the classes extends the class Shape. Each one of the classes
// contain only the method printArea( ) that prints the area of the given shape.


abstract class Shape {
    int a, b; 
    abstract void printArea();
}


class Rectangle extends Shape {
    
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

class Triangle extends Shape {
    
    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}


class Circle extends Shape {
    
    Circle(int radius) {
        this.a = radius; }


    void printArea() {
        System.out.println("Area of Circle: " + (3.14 * a * a));
    }
}


public class Lab6 {
    public static void main(String[] args) {
      
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(5, 10);
        Shape circle = new Circle(7);

        
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
