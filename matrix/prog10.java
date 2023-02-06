//implement program to find row wise min/max elements in the matrix

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
           min=a[i][0];
           for(j=0;j<3;j++)
            {
              if(min>a[i][j])
                 min=a[i][j];
            }
            System.out.println(i+" row min element ="+min);
         }

        int max;
        for(i=0;i<3;i++)
         { 
           max=a[i][0];
           for(j=0;j<3;j++)
            {
              if(max<a[i][j])
                 max=a[i][j];
            }
            System.out.println(i+" row max element ="+max);
         }
   }
}