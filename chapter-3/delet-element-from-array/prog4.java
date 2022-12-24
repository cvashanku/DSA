//deleting all elements from an array

import java.util.*;

class demo
{
  static int[] deleteAll(int[] a)
    {
       int b[]=new int[0];
       return b;
    }
}

class test
{
  public static void main(String args[])
   {
      int[] a={1,2,3,4,5};
      System.out.println("before deleting elements="+Arrays.toString(a));
      System.out.println("After deleting a11 elements="+Arrays.toString(demo.deleteAll(a)));
   }
}