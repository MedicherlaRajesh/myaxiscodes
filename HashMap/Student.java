package HashMap;

import java.util.Scanner;

public class Student {
    String name;
    int rollNo;
    String collage;
    String place;
    String branch;
    int sem;
    
    public Student(String name, int rollNo, String collage, String place, String branch, int sem) {
        this.name = name;
        this.rollNo = rollNo;
        this.collage = collage;
        this.place = place;
        this.branch = branch;
        this.sem = sem;

    }

    public void display() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student rollNo : " + this.name);
        System.out.println("Student collage : " + this.name);
        System.out.println("Student place : " + this.name);
        System.out.println("Student branch : " + this.name);
        System.out.println("Student sem : " + this.name);
    }
     public void uodate() {
        System out.println("Enter student branch name to update: ");
        Scanner sc;
        this.branch = sc.next();
     
    }

    private void println(String string) {
    }
    
}
