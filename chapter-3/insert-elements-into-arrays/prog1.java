//inserting an elements into the first location of an array

import java.util.*;

class demo
{
  static int[] insertAtFirst(int[] a,int element)
    {
       int i, b[]=new int[a.length+1];
        b[0]=element;
        for(i=0;i<a.length;i++)
         {
           b[i+1]=a[i];
         }
        return b;
    }
}

class test
{
  public static void main(String args[])
   {
     int[] a={1,2,3};
     System.out.println(Arrays.toString(a));
     System.out.println(Arrays.toString(demo.insertAtFirst(a,999)));
   }
}