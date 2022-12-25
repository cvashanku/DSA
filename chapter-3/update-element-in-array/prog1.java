//updating an element present at given location

import java.util.*;

class demo
{
  static void updateAtLoc(int a[],int loc,int element)
    {
        for(int i=0;i<a.length;i++)
          {
             if(i==loc)
               a[i]=element;
          }
    }
}

class test
{
  public static void main(String args[])
    {
        int[] a={11,22,33,44,55,66,77,88,999};
        System.out.println("before updating"+Arrays.toString(a));
        demo.updateAtLoc(a,2,18);
        System.out.println("After updating"+Arrays.toString(a));
    }
}