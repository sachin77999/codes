import java.util.Scanner;
public class TwoDArrayDemo {
    public static void main(String args[])
    {
        int arr[][];
       // System.out.println(arr);
       arr=new int[3][3];
      // System.out.println(arr[0][0]);
     display(arr);
     arr[0][0]=10;
     arr[2][0]=20;
     System.out.println("****************");
     display(arr);
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
