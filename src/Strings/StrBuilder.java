package Strings;
import java.util.Scanner;
import java.lang.*;
public class StrBuilder {
    public static void main(String args[])
    {
        StringBuilder s1=new StringBuilder("Hello");
        StringBuilder s2=new StringBuilder(" World");
        StringBuilder s=s1.append(s2);
        System.out.println(s.toString());
    }
}
