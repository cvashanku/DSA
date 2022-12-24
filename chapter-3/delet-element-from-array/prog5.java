//deleting specified element from an array first occurance

import java.util.*;

class demo
{
  static int[] deleteElement(int[] a,int element)
    {
       int index=-1,i,k;
         for(i=0;i<a.length;i++)
           {
              if(a[i]==element)
               {
                index=i;
                break;
               }
           }
          if(index!=-1)
            {
               int b[]=new int[a.length-1];
                 for(i=0,k=0;i<a.length;i++)
                   {
                      if(i==index)
                        continue;
                      else
                        b[k++]=a[i];
                   }
                  return b;
            }
           return a;
    }
}

class test
{
  public static void main(String args[])
    {
      int[] a={1,2,3,4,5,6,7,8,9};
      System.out.println("before deleting="+Arrays.toString(a));
      System.out.println("After deleting="+Arrays.toString(demo.deleteElement(a,6)));
    }
}