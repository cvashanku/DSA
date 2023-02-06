//implement program to find col wise sum of elements in the matrix

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int a[][]=new int[3][3];
     int i,j,sum=0;
     System.out.println("Enter matrix elements:");
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           a[i][j]=obj.nextInt();
         }
      }
      System.out.println("matrix elements are:");
      for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
           {
             System.out.print(a[i][j]+" ");
           }
           System.out.println();
        }
      for(i=0;i<3;i++)
       {
         sum=0;
         for(j=0;j<3;j++)
          {
            sum=sum+a[j][i];
          }
         System.out.println(i+"col sum="+sum);
       }
   }
}