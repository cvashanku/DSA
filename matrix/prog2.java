//implement program to find transpose of the given matrix

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int a[][]=new int[3][3];
     int i,j;
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
       System.out.println("transpose matrix elements are:");
       for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
           {
             System.out.print(a[j][i]+" ");
           }
           System.out.println();
        }
   }
}