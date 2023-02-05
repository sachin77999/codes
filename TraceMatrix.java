import java.io.*;
import java.util.*;
public class TraceMatrix {
    static int max = 50;

    public static void main(String args[])
    {
      int matrix[][] = {
      {2,3,5,6,7},
      {8,9,10,11,12},
      {13,14,15,16,17},
      {18,1,3,0,6},
      {7,8,11,8,11},
      };  
      System.out.println("Trace of the matrix is :"+Trace(matrix,5));
      System.out.println("Normal of the Matrix is :"+Normal(matrix,5));
    }
    static int Trace(int matrix[][],int N)
    {
        int s = 0;
        for(int j=0;j<N;j++)
        s = s + matrix[j][j];
        return s;
    }
    static int Normal(int matrix[][],int N)
    {
        int s = 0;
        for(int j=0;j<N;j++)
        for(int k=0;k<N;k++)
        s = s + matrix[j][k]*matrix[j][k];
        return (int)Math.sqrt(s);
    }
}