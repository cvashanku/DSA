//deleting an element from array

import java.util.*;

class demo
{
  static int[] deletAtFirstLocation(int[] a)
    {
       int i,b[]=new int[a.length-1];
        for(i=0;i<a.length-1;i++)
          {
            b[i]=a[i+1];
          }
         return b;
    }
}

class test
{
  public static void main(String args[])
    {
       int[] a={10,12,18,8,45,8,87,99};
       System.out.println("before deleting an element="+Arrays.toString(a));//{10,12,18,8,45,8,87,99}
       //a=demo.deletAtFirstLocation(a);
       System.out.println("After deleting an element="+Arrays.toString(demo.deletAtFirstLocation(a) ));//{12,18,8,45,8,87,99}
    }
}