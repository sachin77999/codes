import java.util.Scanner;
public class ArrayOperations {
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[])
    {
     int array[]=takeInput();
     display(array);
    }
    public static int[] takeInput()
    {
        System.out.println("Enter the size of the array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the value for "+ i+ " index ?");
            arr[i]=scan.nextInt();
        }
        return arr;
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
