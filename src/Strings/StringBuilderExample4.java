package Strings;
import java.util.Scanner;
public class StringBuilderExample4 {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Java");
        sb.delete(1,3);
        System.out.println(sb);

    }
}
