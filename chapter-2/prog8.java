//Implement a program to find factorial of the given number?


import java.util.*;

class demo
{
  static int fact(int n)
  {
    if(n>=1)
      return n*fact(n-1);
    else
      return 1; 
  }
}

class test
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter n value:");
    int n=obj.nextInt();
    System.out.println(demo.fact(n));
  }
}