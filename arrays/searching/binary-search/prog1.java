//program to demonstrate binary search algorithm to demonstrate

import java.util.*;

class demo
{
  static int binarySearchIteration(int[] a,int key)
    {
      int low,high,mid;
      low=0;
      high=a.length-1;
      while(low<=high)
       {
          mid=(low+high)/2;
          if(key==a[mid])
            return mid;
          else if(key<a[mid])
            high=mid-1;
          else
            low=mid+1;
       }
      return -1;
    }
}

class test
{
  public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       int[] a={10,11,12,13,11,12,14,12,15,16,12,17};
       System.out.println("Array Elements Before Sorting"+Arrays.toString(a));
       Arrays.sort(a);
       System.out.println("Array Elements After Sorting"+Arrays.toString(a));
       System.out.println("Enter key element");
       int key=obj.nextInt();
       System.out.println(demo.binarySearchIteration(a,key));
    }
}