//program to demonstrate merge sort algorithm in Ascending order

import java.util.*;
class demo
{
  static void mergeSortAsc(int[] a,int n)
   {
      if(n<2)
        return;
      int mid=n/2;
      int l[]=new int[mid];
      int r[]=new int[n-mid];
      int i;
      for(i=0;i<mid;i++)
          l[i]=a[i];
      for(i=mid;i<n;i++)
          r[i-mid]=a[i];
      mergeSortAsc(l,mid);
      mergeSortAsc(r,n-mid);
      merge(a,l,r,mid,n-mid);
   }
   static void merge(int[] a,int[] l,int[] r,int left,int right)
     {
        int i=0,j=0,k=0;
        while(i<left && j<right)
          {
           if(l[i]<=r[j])
              a[k++]=l[i++];
            else
              a[k++]=r[j++];
          }
         while(i<left)
            a[k++]=l[i++];
         while(j<right)
            a[k++]=r[j++];
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
     System.out.println(Arrays.toString(a));
     demo.mergeSortAsc(a,a.length);
     System.out.println(Arrays.toString(a));
   }
}