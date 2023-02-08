//implement program to perform addition of two matrix

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int[][] a=new int[3][3];
     int[][] b=new int[3][3];
     int[][] c=new int[3][3];
     int i,j;
     System.out.println("Enter matrix:A elements:");
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           a[i][j]=obj.nextInt();
         }
      }
     System.out.println("Enter matrix:B elements:");
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           b[i][j]=obj.nextInt();
         }
      }
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           c[i][j]=a[i][j]+b[i][j];
         }
      }
     System.out.println("matrix C elements are:");
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           System.out.print(c[i][j]+" ");
         }
         System.out.println();
      }
    }
}