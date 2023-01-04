//program to demonstrate binary search algorithm to demonstrate

import java.util.*;

class demo
{
  static int binarySearchRecursion(int[] a,int key,int low,int high)
    {
      int mid=(low+high)/2;
      if(low>high)
        return -1;
      else
        {
          if(key==a[mid])
            return mid;
          else if(key<a[mid])
            return binarySearchRecursion(a,key,low,mid-1);
          else
            return binarySearchRecursion(a,key,mid+1,high);
            
        }
    }
}

class test
{
  public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       int[] a={10,20,19,11,12,15,14,13,16,17,18};
       System.out.println("Array Elements Before Sorting"+Arrays.toString(a));
       Arrays.sort(a);
       System.out.println("Array Elements After Sorting"+Arrays.toString(a));
       System.out.println("Enter key element");
       int key=obj.nextInt();
       System.out.println(demo.binarySearchRecursion(a,key,0,a.length-1));
    }
}