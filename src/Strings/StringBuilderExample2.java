package Strings;
import java.util.Scanner;
public class StringBuilderExample2 {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Hello");
        sb.insert(1,"java");
        System.out.println(sb);
    }
}
