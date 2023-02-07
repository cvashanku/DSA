//implement program to sort all elements in a row in descending order

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
      for(i=0;i<3;i++)
       {
         Arrays.sort(a[i]);
       }
      System.out.println("updated matrix elements are:");
      for(i=0;i<3;i++)
       {
         for(j=2;j>=0;j--)
          {
            System.out.print(a[i][j]+" ");
          }
          System.out.println();
       }
   }
} 