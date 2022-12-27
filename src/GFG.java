import java.util.*;
import java.lang.*;
public class GFG {
    public static int minMaxProduct(int arr1[],int arr2[],int n,int m)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return arr1[n-1]*arr2[0];
    }
    public static void main(String args[])
    {
        int arr1[]={10,20,30,40,50};
        int arr2[]={1,2,3,4,5,-1};
        int n1=5;
        int n2=6;
        System.out.println(minMaxProduct(arr1,arr2,n1,n2));
    }
}
