class OverloadExample {
    private String name;
    private int age;
   
   
    public OverloadExample(String name) {
        this.name = name;
        this.age = 0;
    }
   
   
    public OverloadExample(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
   
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
   
   
    public void displayInfo(String message) {
        System.out.println(message + " Name: " + name + ", Age: " + age);
    }
   }
   
   
   public class OverloadingDemo {
    public static void main(String[] args) {
        OverloadExample person1 = new OverloadExample("Alice");
        OverloadExample person2 = new OverloadExample("Bob", 30);
   
   
        person1.displayInfo();
        person2.displayInfo();
        person2.displayInfo("Details of person2:");
    }
   }
   