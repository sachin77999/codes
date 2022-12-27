import java.util.Scanner;
public class ArrayOps {
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[]={99,88,77,66,55,40};
      //  bubbleSort(arr);
        selectionSort(arr);
        display(arr);
    }

    public static void bubbleSort(int arr[])
    {
        for(int counter=0;counter<arr.length-1;counter++)
        {
            for(int j=0;j<arr.length-1-counter;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[])
    {
        for(int counter=0;counter<arr.length-1;counter++)
        {
            int min=counter;
            for(int j=counter+1;j<=arr.length-1;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[counter];
            arr[counter]=temp;
        }
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
