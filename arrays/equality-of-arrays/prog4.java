//check for equality by using Arrays.equals() method to sorted array

import java.util.*;

class test
{
  public static void main(String args[])
    {
      int[] a={1,2,3};
      int[] b={4,5,6};
      int[] c={1,3,2};
      int[] d={1,2,3};
      Arrays.sort(a);
      Arrays.sort(b);
      Arrays.sort(c);
      Arrays.sort(d);
      System.out.println(Arrays.equals(a,b));
      System.out.println(Arrays.equals(a,c));
      System.out.println(Arrays.equals(a,d));
    }
} 