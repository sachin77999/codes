package Strings;
import java.util.Scanner;
public class Teststringcomparison1 {
    public static void main(String args[])
    {
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}