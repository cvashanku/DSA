//program to demonstrate insertion sort in descending order

import java.util.*;

class demo
{
  static void insertionSortDsc(int[] a)
    {
      int i,j,temp,n=a.length;
       for(i=1;i<n;i++)
        {
          temp=a[i];
          j=i-1;
          while(j>=0 && a[j]<temp)
           {
             a[j+1]=a[j];
             j--;
           }
           a[j+1]=temp;
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
       System.out.println("before sorting===>"+Arrays.toString(a));
       demo.insertionSortDsc(a);
       System.out.println("After sorting===>"+Arrays.toString(a));
    }
}