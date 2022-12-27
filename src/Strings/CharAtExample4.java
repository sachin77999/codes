package Strings;
import java.util.Scanner;

public class CharAtExample4 {
public static void main(String args[])
{
    String str="Welcome to Javatpoint portal";
    for(int i=0;i<=str.length()-1;i++)
    {
        if(i%2!=0)
        {
            System.out.println(str.charAt(i));
        }
    }
}
}
