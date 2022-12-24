//deleting an element from an array from last location

import java.util.*;

class demo
{
  static int[] deleteAtLastLocation(int[] a)
   {
     int i,b[]=new int[a.length-1]; 
     for(i=0;i<a.length-1;i++)
      {
        b[i]=a[i];
      }
     return b;
   }
}

class test
{
  public static void main(String args[]) 
   {
     int[] a={10,22,33,44,55,66,77,88,99};
     System.out.println("before deleting an element="+Arrays.toString(a));
     //a=demo.deleteAtLastLocation(a);
     System.out.println("After deleting an element="+Arrays.toString(demo.deleteAtLastLocation(a)));
   }
}