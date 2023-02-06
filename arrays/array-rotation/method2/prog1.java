//By using temp variable in left rotation

import java.util.*;

class demo
{
   static void leftRotation(int[] a,int r)
     {
       int i,j,temp;
       r=r%a.length;
       for(i=0;i<r;i++)
         {
           temp=a[0];
           for(j=0;j<a.length-1;j++)
               a[j]=a[j+1];
               a[a.length-1]=temp;
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