//program to print prime and non prime numbers to the given range?

import java.util.*;

class demo
{
  static boolean isprime(int n,int i)
  {
    if(i==1)
      return true;
    else if(n%i==0)
      return false;
    else
      return isprime(n,--i);
  }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter n value:");
     int n=obj.nextInt();
     for(int i=2;i<=n;i++)
     System.out.println(i+"=========>"+ (demo.isprime(i,i/2)));
   }
}