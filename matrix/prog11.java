//implement program to find col wise min/max elements in the matrix

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
        int min;
        for(i=0;i<3;i++)
         { 
           min=a[0][i];
           for(j=0;j<3;j++)
            {
              if(min>a[j][i])
                 min=a[j][i];
            }
            System.out.println(i+" col min element ="+min);
         }

        int max;
        for(i=0;i<3;i++)
         { 
           max=a[0][i];
           for(j=0;j<3;j++)
            {
              if(max<a[j][i])
                 max=a[j][i];
            }
            System.out.println(i+" col max element ="+max);
         }
   }
}