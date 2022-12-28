// program to demonstrate bubble sort in ascending order

import java.util.*;

class demo
{
   static void bubbleSortAsc(int[] a)
    {
    int i,j,t;
    for(i=0;i<a.length-1;i++)
     {
        for(j=0;j<a.length-i-1;j++)
         {
            if(a[j]>a[j+1])
              {
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
              }
         }
     }
   }
}

class test
{
   public static void main(String args[])
    {
       Random r=new Random();
       int[] a=new int[10];
       for(int i=0;i<a.length;i++)
        {
           a[i]=r.nextInt(100);
        }
       System.out.println("before sorting="+Arrays.toString(a));
       demo.bubbleSortAsc(a);
       System.out.println("After sorting"+Arrays.toString(a));
    }
}