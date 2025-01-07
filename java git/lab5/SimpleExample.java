Demonstrate Static variables and methods example

class Calculator {
 static int count = 0;


 public static int add(int a, int b) {
     count++;
     return a + b;
 }


 public static void displayCount() {
     System.out.println("Total calculations: " + count);
 }
}


public class SimpleExample {
 public static void main(String[] args) {
     int result1 = Calculator.add(5, 3);
     int result2 = Calculator.add(10, 2);


     System.out.println("Result 1: " + result1);
     System.out.println("Result 2: " + result2);


     Calculator.displayCount();
 }
}
