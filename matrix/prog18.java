//implement program to check whether the given matrix is symmetric matrix or not

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int[][] a=new int[3][3];
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
     boolean flag=true;
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           if(i==j && a[i][j]!=1)
             {
               flag=false;
               break;
             }
           if(i!=j && a[i][j]!=0)
             {
               flag=false;
               break;
             }
         }
      }
      System.out.println(flag);
   }
}