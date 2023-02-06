//program to demonstrate selection sort in descending order

import java.util.*;

class demo
{
  static void selectionSortDesc(int[] a)
    {
      int i,j,max,temp,n=a.length;
      for(i=0;i<n;i++)
        {
          max=i;
          for(j=i+1;j<n;j++)
           {
             if(a[j]>a[max])
                  max=j;
           }
              if(max!=i)
               {
                  temp=a[i];
                  a[i]=a[max];
                  a[max]=temp;
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
       demo.selectionSortDesc(a);
       System.out.println("After sorting===>"+Arrays.toString(a));
   }
}