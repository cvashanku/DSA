//declaration, creation and intilization of an array in single line

import java.util.*;

class test
{
  public static void main(String args[])
   {
      int[] a={1,2,3,4,5};
      System.out.println(a[0]);
      System.out.println(a[1]);
      System.out.println(a[2]);
      System.out.println(a[3]);
      System.out.println(a[4]);

      int[] [] b={{1,2,3},{4,5,6},{7,8,9}};
      System.out.println(b[0][0]);
      System.out.println(b[0][1]);
      System.out.println(b[0][2]);

      System.out.println(b[1][0]);
      System.out.println(b[1][1]);
      System.out.println(b[1][2]);

      System.out.println(b[2][0]);
      System.out.println(b[2][1]);
      System.out.println(b[2][2]);
   }
}