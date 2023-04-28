import java.util.Scanner;
import java.util.*;
public class Matrix{
public static void main(String[]args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print("enter the rows:");
int m=sc.nextInt();
System.out.print("enter the colums:");
int n=sc.nextInt();
int[][]matrix1=new int[m][n];
int[][]matrix2=new int[m][n];
int[][]matrix3=new int[m][n];
System.out.print("enter the elements of matrix1:");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    matrix1[i][j]=sc.nextInt();
   }
}
System.out.print("enter the elements of matrix2:");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    matrix2[i][j]=sc.nextInt();
   }
}
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
   }
}
System.out.print("addition of two matrix is:");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    System.out.print(matrix3[i][j]+"\t");
   }
   System.out.println();
}
}
}

