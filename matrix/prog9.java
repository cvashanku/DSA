//implement program to find min/max elements in the matrix

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
        int min=a[0][0];
        for(i=0;i<3;i++)
         {
           for(j=0;j<3;j++)
            {
              if(min>a[i][j])
                 min=a[i][j];
            }
         }
         System.out.println("min element in matrix ="+min);

        int max=a[0][0];
        for(i=0;i<3;i++)
         {
           for(j=0;j<3;j++)
            {
              if(max<a[i][j])
                 max=a[i][j];
            }
         }
         System.out.println("max element in matrix ="+max);
   }
}