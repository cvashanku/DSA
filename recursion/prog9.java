//Implement a program to calculate product of two integer values (a*b)

import java.util.*;

class demo
{
  static int product(int a,int b)
   {
     if(a<b)
       return product(b,a);
     else if(b!=0)
       return a+product(a,b-1);
     else
       return 0;
   }
}

class test
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter a value:");
    int a=obj.nextInt();
    System.out.println("enter b value:");
    int b=obj.nextInt();
    System.out.println(demo.product(a,b));
  }
}