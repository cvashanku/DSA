//implement program to find sum of all even and odd elements in the matrix

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     int a[][]=new int[3][3];
     int i,j,sum=0,sume=0,sumo=0;
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
         for(j=0;j<3;j++)
          {
            if(a[i][j]%2==0)
              sume=sume+a[i][j];
             else
              sumo=sumo+a[i][j];
          }
       }
       sum=sume+sumo;
       System.out.println("sum of even elements="+sume);
       System.out.println("sum of odd elements="+sumo);
       System.out.println("sum of all elements="+sum);
   }
}