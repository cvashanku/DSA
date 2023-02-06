//implement program to find sum of opp diagonal elements in the matrix

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
         sum=sum+a[i][3-i-1];
       }
       System.out.println("sum of opp diagonal elemennts="+sum);
   }
}