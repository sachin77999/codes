package oops;
import java.util.Scanner;
public class PersonClient {
    public static void main(String args[])
    {
        Person p1=new Person();
        Person p2=new Person();
        Person p3=new Person(25);
        Person p4=new Person(20,"Sachin Soni");
//        System.out.println(p1.name);
//        System.out.println(p1.age);
System.out.println(p1.getName());
System.out.println(p1.getAge());
//        p2.name="A";
//        p2.age=10;
//        p2.setName("A");
//        p2.setAge(20);


        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p3.getAge());
        System.out.println(p3.getName());
        System.out.println(p4.getAge());
        System.out.println(p4.getName());
    }
}
