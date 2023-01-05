//By using temp variable in right rotation

import java.util.*;

class demo
{
   static void rightRotation(int[] a,int r)
     {
       int i,j,temp;
       r=r%a.length;
       for(i=0;i<r;i++)
         {
           temp=a[a.length-1];
           for(j=a.length-1;j>0;j--)
               a[j]=a[j-1];
               a[0]=temp;
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
       demo.rightRotation(a,r);
       System.out.println("After "+r+" Rotations Array"+Arrays.toString(a));
    }
}