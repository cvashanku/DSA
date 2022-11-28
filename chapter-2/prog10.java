//Implement a program to check whether the given number is prime number or not?

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
     System.out.println(demo.isprime(n,n/2)?"yes,it is prime":"no,not a prime");
   }
}