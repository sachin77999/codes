package Strings;
import java.util.Scanner;
public class CharAtExample5 {
    public static void main(String args[])
    {
        String str="Welcome to Javatpoint portal";
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)=='t') {
                count++;
            }
        }
        System.out.println(count);
    }
}
