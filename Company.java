import java.util.Scanner;
public class Company {
    String empName;
    private String empId;
    String empcompanyName;
    String empPlace;
    protected int empAge;
    privata String empPos;
 public Company(String empName, String empId, String empcompanyName, String empPlace, int empAge,String empPos){
     this.empName = empName;
     this.empId = empId;
     this.empcompanyName = empcompanyName;
     this.empPlace = empPlace;
     this.empAge = empAge;
     this.empPos = empPos;
 }
 public void createUser(Company obj1){
     Scanner sc = new Scanner(system.in);
        System.out.println(x:"Enter the name : ");
        obj1.empName = sc.next();
        System.out.println(x:"Enter the id : ");
        obj1.empId = sc.nextint();
        System.out.println(x:"Enter the companyName : ");
        obj1.empcompanyName = sc.next();
        System.out.println(x:"Enter the place : ");
        obj1.empPlace = sc.next();
        System.out.println(x:"Enter the age : ");
        obj1.empAge = sc.next();
        System.out.println(x:"Enter the pos : ");
        obj1.empPos = sc.next();
 }
 public void displayUser(){
     System.out.println("Enter the name : "+this.empName);
     System.out.println("Enter the nid : "+this.empId);
     System.out.println("Enter the companyName : "+this.empcompanyName);
     System.out.println("Enter the place : "+this.empPlace);
     System.out.println("Enter the age: "+this.empAge);
     System.out.println("Enter the pos : "+this.empPos);
 }
 public static void main(String[] args) {
     String empName;
     String empId;
     String empcompanyName;
     String empPlace;
     String empAge;
     String empos;
     Company obj1 = new Company(empName = "Rajesh", empId = "Axis69", empcompanyName = "AxisBank", empPlace = "Mumbai", empAge = "22"empPos = "Manager");
     obj1.createUser(obj1);
     obj1.displayUser();
    }

}

