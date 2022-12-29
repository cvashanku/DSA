//program to demonstrate quick sort in descending order

import java.util.*;

class demo
{
  static void quickSortDsc(int[] a,int lIndex,int rIndex)
   {
      if(lIndex>=rIndex)
        return;
      int pivot,lp,rp,temp;
        pivot=a[rIndex];
        lp=lIndex;
        rp=rIndex;
      while(lp<rp)
       {
          while(a[lp]>=pivot && lp<rp)
            lp++;
          while(a[rp]<=pivot && lp<rp)
            rp--;
          temp=a[lp];
          a[lp]=a[rp];
          a[rp]=temp;
       }
       temp=a[lp];
       a[lp]=a[rIndex];
       a[rIndex]=temp;
       quickSortDsc(a,lIndex,lp-1);
       quickSortDsc(a,lp+1,rIndex);
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
        demo.quickSortDsc(a,0,a.length-1);
        System.out.println("After  sorting===>"+Arrays.toString(a));
   }
}