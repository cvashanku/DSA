//Implement a program to count number of digits present in the given number?

import java.util.*;

class demo
{
  static int c=0;
  static int count(int n)
   {
     if(n!=0)
      {
        c++;
        count(n/10);
      }
      return (c!=0)?c:1;
   }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter any number:");
     int n=obj.nextInt();
     System.out.println(demo.count(n));
   }
}