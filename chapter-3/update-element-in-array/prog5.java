//updating the given element with new element all occurrences

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
            }
        }
    }
}

class test
{
  public static void main(String args[])
   {
     int[] a={11,22,22,44,55,22,65,76,22};
     System.out.println("before update"+Arrays.toString(a));
     demo.updateElement(a,22,18);
     System.out.println("After update"+Arrays.toString(a));
   }
}