//generating random values for array

import java.util.*;

class test
{
  public static void main(String args[])
   {
      Random r=new Random();
      int[] a=new int[10];
      
      for(int i=0;i<a.length;i++)
        {
           a[i]=r.nextInt(100);
        }
       System.out.println(Arrays.toString(a));
   }
}