//Brute Force algorithm in left rotation

import java.util.*;

class demo
{
   static void leftRotation(int[] a,int r)
     {
       int i,j,prev,temp;
       r=r%a.length;
       for(i=0;i<r;i++)
         {
           prev=a[0];
           for(j=a.length-1;j>=0;j--)
             {
               temp=a[j];
               a[j]=prev;
               prev=temp;
             }
         }
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
       System.out.println("Before Rotating Array"+Arrays.toString(a));
       demo.leftRotation(a,r);
       System.out.println("After "+r+" Rotations Array"+Arrays.toString(a));
    }
}