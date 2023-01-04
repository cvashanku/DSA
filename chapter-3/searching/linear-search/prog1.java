//program to demonstrate linear search algorithm

import java.util.*;

class demo
{
   static int linearSearch(int[] a,int key)
    {
      for(int i=0;i<a.length;i++)
        {
           if(key==a[i])
              return i;
        }
       return -1;
    }
}

class test
{
  public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       Random r=new Random();
       int[] a=new int[10];
       for(int i=0;i<a.length;i++)
           a[i]=r.nextInt(100);
       System.out.println("Array Elements:"+Arrays.toString(a));
       System.out.println("Enter key element");
       int key=obj.nextInt();
       System.out.println(demo.linearSearch(a,key));
    }
}