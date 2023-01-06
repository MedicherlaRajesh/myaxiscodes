import java.util.Scanner;
public class constoverdemo {
    String shoeName;
    String orderId;
    String brandName;
    protected int price;
        
public constoverdemo(String shoeName, String orderId, String brandName, int price) {
        this.shoeName = shoeName;
        this.orderId = orderId;
        this.brandName = brandName;
        this.price = price;
    }
public void creatCustomer(constoverdemo obj1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("shoeName : ");
        sc.next();
        System.out.println("orderId : ");
        sc.next();
        System.out.println("brandName : ");
        sc.next();
        System.out.println("price : ");
        sc.nextInt();
    }
public void display() {
        System.out.println("shoeName : " + this.shoeName);
        System.out.println("orderId : " + this.orderId);
        System.out.println("brandName : " + this.brandName);
        System.out.println("price : " + this.price);
    }
public static void main(String args[]){
        String shoeName;
        String orderId;
        String brandName;
        int price;
        constoverdemo obj1 = new constoverdemo(shoeName = "puma", orderId = "pum022", brandName = "nike", price = 4999);
        obj1.creatCustomer(obj1);
        obj1.display();
    }
    
}

