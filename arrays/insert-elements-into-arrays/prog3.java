//inserting an element into the specified location of an array

import java.util.*;

class demo
{
  static int[] insertAtLoc(int[] a,int element,int index)
   {
    int i,b[]=new int[a.length+1];
    for(i=0;i<index;i++)
       b[i]=a[i];
      //b[index]=element;
      b[i]=element;
    for(;i<a.length;i++)
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
       int[] a={1,2,3,4};
       System.out.println(Arrays.toString(a));
       //a=demo.insertAtLoc(a,888,2);
       System.out.println(Arrays.toString(demo.insertAtLoc(a,888,2)));
    }
}  