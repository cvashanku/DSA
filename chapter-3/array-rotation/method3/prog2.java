//by using temp array in right rotation

import java.util.*;

class demo
{
   static void rightRotation(int[] a,int r)
     {
        int i,n=a.length;
        int temp[]=new int[r];
         
        for(i=0;i<r;i++)
         temp[i]=a[n-r+i];
        for(i=n-r-1;i>=0;i--)
          a[i+r]=a[i];
        for(i=0;i<r;i++)
          a[i]=temp[i];
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
      demo.rightRotation(a,r);
      System.out.println("After rotating array ===>"+Arrays.toString(a));
    }
}