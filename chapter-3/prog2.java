//if we want to provide our own values, the we have to assign the values by using assignment operator explicitly.

import java.util.*;

class test
{
  public static void main(String args[])
   {
      int[] a=new int[3];
      a[0]=101;
      a[1]=102;
      a[2]=103;
      System.out.println(a[0]);
      System.out.println(a[1]);
      System.out.println(a[2]);

      boolean[] b=new boolean[4];
      System.out.println(b[0]);
      System.out.println(b[1]);
      System.out.println(b[2]);
      System.out.println(b[3]);

      boolean[] b1=new boolean[4];
      b1[0]=true;
      b1[2]=true;
      System.out.println(b1[0]);
      System.out.println(b1[1]);
      System.out.println(b1[2]);
      System.out.println(b1[3]);

      String[] names=new String[3];
      System.out.println(names[0]);
      System.out.println(names[1]);
      System.out.println(names[2]);


      String[] names1=new String[3];
      names1[0]="siva";
      names1[1]="shankar";
      System.out.println(names1[0]);
      System.out.println(names1[1]);
      System.out.println(names1[2]);
   }
}