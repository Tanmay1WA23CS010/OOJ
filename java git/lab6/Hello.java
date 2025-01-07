
 // generics in class
 
 class Pair<T, U> {
    private T first;
    private U second;

     public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public <T,U> Display(){
        System.out.println("First: "+first+" Second: "+second);
    }


    public static void Hello(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Double, Boolean> pair2 = new Pair<>(2.5, true);

        pair1.display();
        pair2.display();
    }
}


// generics in methods

public class Hello {

    // Generic method to print elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        // String array
        String[] strArray = {"Hello", "World", "Generics"};
        System.out.println("String Array:");
        printArray(strArray);

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double Array:");
        printArray(doubleArray);
    }
}
