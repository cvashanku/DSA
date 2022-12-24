//check for equality including sorted array

import java.util.*;

class demo
{
  static boolean isEqual(int[] a,int[] b)
   {
     for(int i=0;i<a.length;i++)
      {
        if(a[i]!=b[i])
          return false;
      }
     return true;
   }
}

class test
{
  public static void main(String args[])
   {
     int[] a={1,2,3};
     int[] b={4,5,6};
     int[] c={1,2,3};
     int[] d={1,3,2};
     Arrays.sort(a);
     Arrays.sort(b);
     Arrays.sort(c);
     Arrays.sort(d);
     
     System.out.println(demo.isEqual(a,b));
     System.out.println(demo.isEqual(a,c));
     System.out.println(demo.isEqual(a,d));
   }
}