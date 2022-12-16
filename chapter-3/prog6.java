//program to demonstrate ArrayIndexOutOfBounds exception

import java.util.*;

class test
{
 public static void main(String args[])
   {
      int[] a=new int[3];
      System.out.println(a.length);
    
      System.out.println(a[0]);
      System.out.println(a[1]);
      System.out.println(a[2]);
 
      a[0]=111;
      a[1]=222;
      a[2]=333;
      System.out.println(a[0]);
      System.out.println(a[1]);
      System.out.println(a[2]);
      System.out.println(a[3]);
   }
}