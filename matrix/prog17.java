//implement program to swap main and opp diagonal elements

import java.util.*;
class Test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      int a[][]=new int[3][3];
      int i,j,t;
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
         t=a[i][i];
         a[i][i]=a[i][3-i-1];
         a[i][3-i-1]=t;
       }
      System.out.println("updated matrix elements are:");
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