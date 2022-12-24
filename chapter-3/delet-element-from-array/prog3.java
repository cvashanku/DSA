//deleting an element from an array in from location

import java.util.*;

class demo
{
  static int[] deleteAtLocation(int[] a,int loc)
   {
     int i,k,b[]=new int[a.length-1];
       for(i=0,k=0;i<a.length;i++)
         {
           if(i==loc)
             continue;
            else
              b[k++]=a[i];
         }
        return b;
   }
}

class test
{
  public static void main(String args[])
    {
       int[] a={11,22,33,44,55,66,77,88,99};
       System.out.println("before deleting an element"+Arrays.toString(a));
       System.out.println("After deleting an element"+Arrays.toString(demo.deleteAtLocation(a,2)));
    }
}