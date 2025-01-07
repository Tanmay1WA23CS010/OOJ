// Demonstrate Concept on Type  Casting

public class TypeCasting {
   public static void main(String[] args) {
       int myInt = 10;
       double myDouble = myInt;
       System.out.println("Implicit Type Casting: " + myDouble);


       double myDouble2 = 10.5;
       int myInt2 = (int) myDouble2;
       System.out.println("Explicit Type Casting: " + myInt2);
   }
}
