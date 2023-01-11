//by using temp array in left rotation

import java.util.*;

class demo
{
   static void leftRotation(int[] a,int r)
     {
        int i,j,n=a.length;
        int temp[]=new int[r];
         
        for(i=0;i<r;i++)
         temp[i]=a[i];
        for(i=r;i<n;i++)
          a[i-r]=a[i];
        for(i=0;i<r;i++)
          a[i+n-r]=temp[i];
     }
}

class test
{
  public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int[] a={1,2,3,4,5};
      System.out.println("Enter number of rortations:");
      int r=obj.nextInt();
      System.out.println("Before rotating array ===>"+Arrays.toString(a));
      demo.leftRotation(a,r);
      System.out.println("After rotating array ===>"+Arrays.toString(a));
    }
}