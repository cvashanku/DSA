//implement a program to read and write matrix elements

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
      System.out.println("Enter matrix elements are:");
      for(i=0;i<3;i++)
       {
         for(j=0;j<3;j++)
          {
            System.out.print(a[i][j]+" ");
          }
         System.out.println();
       }
   }
}