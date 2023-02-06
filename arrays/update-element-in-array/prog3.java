//update the given element with new element first occurrence

import java.util.*;

class demo
{
  static void updateElement(int[] a,int olde,int newe)
    {
       for(int i=0;i<a.length;i++)
         {
            if(a[i]==olde)
              {
               a[i]=newe;
                break;
              }
         }
    }
}

class test
{
  public static void main(String args[])
    {
      int[] a={11,332,44,66,77,88,54,78,92};
      System.out.println("before update"+Arrays.toString(a));
      demo.updateElement(a,44,18);
      System.out.println("After updating"+Arrays.toString(a));
    }
}