package oops;
import java.util.Scanner;
public class Person {
     String name;
     int age;

//     public String getName()
//     {
//         return this.name;
//     }
//     public void setName(String name)
//     {
//         this.name=name;
//     }
//     public int getAge()
//     {
//         return age;
//     }
//     public void setAge(int age)
//     {
//         this.age=age;
//     }
       public Person()
       {
System.out.println("I am the default constructor");
       }
       public Person(int age)
       {
System.out.println("I' am parameterized constructor with one parameter");
this.age=age;
       }
       public Person(int age,String name)
       {
           System.out.println("I am parameterized constructor with two parameters");
           this.age=age;
           this.name=name;
       }
       public String getName()
       {
           return name;
       }
       public int getAge()
       {
           return age;
       }
}
