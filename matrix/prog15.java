//implement program to swap two given rows

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int a[][]=new int[3][3];
     int i,j,r1,r2,t;
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
      System.out.println("Enter row value to swap");
      r1=obj.nextInt();
      r2=obj.nextInt();
      for(i=0;i<3;i++)
       {
         t=a[r1-1][i];
         a[r1-1][i]=a[r2-1][i];
         a[r2-1][i]=t;
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