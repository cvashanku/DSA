//program to demonstrate linear search algorithm to first two occurencess

import java.util.*;

class demo
{
  static ArrayList linearSearch(int[] a,int key)
    {
       int i,c=0;
       ArrayList list=new ArrayList();
       for(i=0;i<a.length;i++)
         {
           if(key==a[i])
             {
              c++;
              list.add(i);
              if(c==2)
              break; 
             }
         }
        return list;
    }
}

class test
{
  public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       int[] a={10,11,12,13,11,12,14,12,15,16,12,17};
       System.out.println("Array Elements:"+Arrays.toString(a));
       System.out.println("Enter key element");
       int key=obj.nextInt();
       System.out.println(demo.linearSearch(a,key));
    }
}