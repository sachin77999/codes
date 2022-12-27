package Strings;
import java.util.Scanner;
public class EndsWithExample3 {
    public static void main(String args[])
    {
        String str="Welcome to JavaTpoint";
        System.out.println(str.endsWith("javaTpoint"));
        System.out.println(str.endsWith("Javatpoint"));
        System.out.println(str.endsWith("JavaTpoint"));
    }
}
