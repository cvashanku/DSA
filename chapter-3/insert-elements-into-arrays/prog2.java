//inserting an element in the last locaton of an array

import java.util.*;

class demo
{
  static int[] insertAtLast(int[] a,int element)
    {
       int i,b[]=new int[a.length+1];
       for(i=0;i<a.length;i++)
         {
            b[i]=a[i];
         }
          b[i]=element;
          return b;
    }
}

class test
{
  public static void main(String args[])
   {
     int[] a={1,2,3};
     System.out.println(Arrays.toString(a));
     //a= demo.insertAtLast(a,999);
     System.out.println(Arrays.toString(demo.insertAtLast(a,999)));
   }
}