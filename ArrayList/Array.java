package ArrayList;
import java.util.ArrayList;

import java.util.Iterator;

public class Array {
    String name;
    int number;
    String place;
    long phoneNumber;
    public Array(String name, int number, String place, long phoneNumber) {
        this.name = name;
        this.number = number;
        this.place = place;;
        this.phoneNumber = phoneNumber;
    }
    public void display(){

    }
    public static void main(String[] args) {
        Array obj1 = new Array("Rajesh", 1, "Malikipuram",7995679844L);
        Array obj2 = new Array("Mahesh", 2, "Malikipuram",9000123456L);
        Array obj3 = new Array("Aditya", 3, "Malikipuram",7891012345L);

        ArrayList<Array>List = new ArrayList<Array>();

        List.add(obj1);
        List.add(obj2);
        List.add(obj3);

        System.out.print(List.isEmpty());
        for(Array i : List){
            i.display();
        }
        Iterator it = List.iterator();
        while(it.hasNext()){
            Array obj = (Array)it.next();
            obj1.display();
        }

    }
}