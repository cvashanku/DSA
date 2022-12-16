//Implement a program to read array elements and find sum of all elements in array.

import java.util.*;

class test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      System.out.println("enter array size:");
      int n=obj.nextInt();
      int[] a=new int[n];
      int i=0,sum=0;
      System.out.println("enter "+n+" array elements");
      for(i=0;i<a.length;i++)
        a[i]=obj.nextInt();
     
      for(i=0;i<n;i++)
         sum=sum+a[i];
       System.out.println("sum="+sum);
     
   }
}