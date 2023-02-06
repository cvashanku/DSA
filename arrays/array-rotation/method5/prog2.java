//by using reversal algorithm in right rotation

import java.util.*;

class demo
{
   static void reverse(int[] a,int b,int e)
    {
       int temp;
       while(b<e)
         {
           temp=a[b];
           a[b]=a[e];
           a[e]=temp;
           b++;
           e--;
         }
    }   

   static void rightRotation(int[] a,int r)
     {
       int n=a.length;
       reverse(a,0,n-1);
       reverse(a,0,r-1);
       reverse(a,r,n-1);
     }
}

class test
{
  public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int[] a={1,2,3,4,5};
      System.out.println("Enter number of rotations:");
      int r=obj.nextInt();
      System.out.println("Before rotating array ===>"+Arrays.toString(a));
      demo.rightRotation(a,r);
      System.out.println("After rotating array ===>"+Arrays.toString(a));
    }
}