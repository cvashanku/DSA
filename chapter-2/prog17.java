//Implement a program to find nth fib number

import java.util.*;

class demo
{
  static int fib(int n)
   {
     if(n==0||n==1)
      return n;
     else
       return fib(n-1)+fib(n-2);
   }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter any number:");
     int n=obj.nextInt();
     System.out.println(demo.fib(n));
   }
}