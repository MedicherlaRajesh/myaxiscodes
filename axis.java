import java.util.Scanner;

public class axis {
    String name;
    private String userid;
    String companyname;
    String place;
    protected int age;
    private String pos;

    public void createUser(axis obj){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        obj.name = sc.next();
        System.out.println("Enter user id:");
        obj.userid = sc.next();
        System.out.println("Enter company name:");
        obj.companyname = sc.next();
        System.out.println("Enter place:");
        obj.place = sc.next();
        System.out.println("Enter age:");
        obj.age = sc.nextInt();
        System.out.println("Enter position:");
        obj.pos = sc.next();

    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("User id: " +userid);
        System.out.println("Company name: " +companyname);
        System.out.println("Place: " +place);
        System.out.println("Age: " +age);
        System.out.println("Position: " +pos);
    }
    public static void main(String[] args){
        axis obj = new axis();
        obj.createUser(obj);
        obj.display();

    }
}
