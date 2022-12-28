//program to demonstrate selection sort in ascending order

import java.util.*;

class demo
{
  static void selectionSortAsc(int[] a)
    {
       int i,j,min,temp,n=a.length;
       for(i=0;i<n;i++)
        {
           min=i;
           for(j=i+1;j<n;j++)
            {
              if(a[j]<a[min])
                min=j;
            }
            if(min!=i)
             {
               temp=a[i];
               a[i]=a[min];
               a[min]=temp;
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
        System.out.println("before sorting===>"+Arrays.toString(a));
        demo.selectionSortAsc(a);
        System.out.println("After sorting===>"+Arrays.toString(a));
    }
} 