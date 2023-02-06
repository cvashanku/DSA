//deleting specified element from an array first and second occurrence

import java.util.*;

class demo
{
  static int[] deleteAtLocation(int[] a,int loc)  
     {
       int i,k,b[]=new int[a.length-1];
        for(i=0,k=0;i<a.length;i++)
         {
            if(i==loc)
              continue;
             else
              b[k++]=a[i];
         }
        return b;
     }

  static int[] deleteElement(int a[],int element)
    {
       int index=-1,i,c=0;
       for(i=0;i<a.length;i++)
        {
           if(a[i]==element)
            {
               c++;
               a=deleteAtLocation(a,i);
            }              
        }
       return a;
    }
}

class test
{
  public static void main(String args[])
    {
        int[] a={10,11,12,13,12,15,12};
        System.out.println("before deleting ="+Arrays.toString(a));
        a=demo.deleteElement(a,12);
        System.out.println("After deleting ="+Arrays.toString(a));
    }
}