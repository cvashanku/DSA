//by using temp array in right rotation

import java.util.*;

class demo
{
   static void rightRotation(int[] a,int r)
     {
        int i,n=a.length;
        int temp[]=new int[n];
         
        for(i=0;i<n;i++)
         temp[(i+r)%n]=a[i];
        for(i=0;i<n;i++)
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