package Lecture9;
import java.util.Scanner;
public class TimeComplexityDemo {
    public static void main(String args[])
    {
System.out.println(power(3,6));
    }
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int pn2=power(x,n/2);
        if(n%2==1)
        {
            return pn2*pn2*x;
        }
        else
        {
            return pn2*pn2;
        }
    }
}
