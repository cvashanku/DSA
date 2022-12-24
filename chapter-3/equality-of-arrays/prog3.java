//check for equality by using predefined method Arrays.equals()

import java.util.*;

class test
{
  public static void main(String args[])
    {
       int[] a={1,2,3};
       int[] b={4,5,6};
       int[] c={1,2,3};
       int[] d={1,3,2};
       System.out.println(Arrays.equals(a,b));
       System.out.println(Arrays.equals(a,c));
       System.out.println(Arrays.equals(a,d));
    }
}