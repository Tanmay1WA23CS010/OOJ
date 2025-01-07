package lab9.Packages;

import CIE.Student;  

public class External extends Student {
    public int[] externalMarks;

    
    public External(String usn, String name, int sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }

    
    public void printExternalMarks() {
        System.out.println("External Marks for " + name + " (" + usn + "):");
        for (int i = 0; i < externalMarks.length; i++) {
            System.out.println("Course " + (i + 1) + ": " + externalMarks[i]);
        }
    }
}
