//Implement a program to find HCF/GCD of the given two numbers

import java.util.*;

class demo
{
  static int gcd(int a,int b)
   {
     while(a!=b)
      {
         if(a>b)
             return gcd(a-b,b);
          else
             return gcd(a,b-a);
      }
      return a;
   }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter n1 value:");
     int n1=obj.nextInt();
     System.out.println("enter n2 value:");
     int n2=obj.nextInt();
     System.out.println(demo.gcd(n1,n2));
   }
}