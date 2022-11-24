//Implement a program to calculate sum of 'n' natural numbers

import java.util.*;

class demo
{
  static int sum(int n)
  {
    if(n==1)
      return 1;
    else
      return n+sum(n-1);
  }
}

class test
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter n value:");
    int n=obj.nextInt();
    System.out.println(demo.sum(n));
  }
}