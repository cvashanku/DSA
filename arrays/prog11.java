//sum of odd elements in array

import java.util.*;

class test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      System.out.println("enter array size:");
      int n=obj.nextInt();
      int[] a=new int[n];
      int i,sum;
      System.out.println("enter "+n+" array elements");
      for(i=0;i<a.length;i++)
        a[i]=obj.nextInt();
      sum=0;
      for(i=0;i<n;i++)
       {
         if(a[i]%2!=0)
           sum=sum+a[i];
       }
       System.out.println("sum of odd numbers="+sum);
     
   }
}