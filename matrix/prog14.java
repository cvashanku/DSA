//implement program to sort all elements in a col in ascending order

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
      int b[][]=new int[3][3];
      for(i=0;i<3;i++)
       {
         for(j=0;j<3;j++)
          {
            b[i][j]=a[j][i];
          }
       }
      for(i=0;i<3;i++)
       {
         Arrays.sort(b[i]);
       }
      System.out.println("updated matrix elements are:");
      for(i=0;i<3;i++)
       {
         for(j=0;j<3;j++)
          {
            System.out.print(b[j][i]+" ");
          }
          System.out.println();
       }
   }
} 