//implement program to perform multiplication of two matrix

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int[][] a=new int[3][3];
     int[][] b=new int[3][3];
     int[][] c=new int[3][3];
     int i,j,k;
     System.out.println("Enter matrix:A elements:");
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           a[i][j]=obj.nextInt();
         }
      }
     System.out.println("Enter matrix:B elements:");
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         {
           b[i][j]=obj.nextInt();
         }
      }
     for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
         { 
           c[i][j]=0;
           for(k=0;k<3;k++)
            {
              c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
            }
          }
       }
        System.out.println("matrix:C elements are:");
        for(i=0;i<3;i++)
         {
           for(j=0;j<3;j++)
            {
              System.out.print(c[i][j]+" ");
            }
            System.out.println();
         }
   }
}