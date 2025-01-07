package lab9.Packages;
import CIE.Internals;
import SEE.External;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();

            
            int[] internalMarks = new int[5];
            System.out.println("Enter Internal Marks for 5 Courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = scanner.nextInt();
            }

            
            int[] externalMarks = new int[5];
            System.out.println("Enter External Marks for 5 Courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                externalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();  

           
            Internals internalStudent = new Internals(usn, name, sem, internalMarks);
            External externalStudent = new External(usn, name, sem, externalMarks);

            
            internalStudent.printInternalMarks();
            externalStudent.printExternalMarks();

            
            printFinalMarks(internalStudent, externalStudent);
        }

        scanner.close();
    }

    
    public static void printFinalMarks(Internals internal, External external) {
        int[] internalMarks = internal.internalMarks;
        int[] externalMarks = external.externalMarks;
        int totalMarks;

        System.out.println("Final Marks for " + internal.getName() + " (" + internal.getUsn() + "):");
        for (int i = 0; i < internalMarks.length; i++) {
            totalMarks = internalMarks[i] + externalMarks[i];
            System.out.println("Course " + (i + 1) + ": " + totalMarks);
        }
    }
}
