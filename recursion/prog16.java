//Implement a program to convert decimal number into binary?

import java.util.*;

class demo
{
  static int convert(int n)
   {
     if(n==0)
       return 0;
     else
       return (n%2)+(10*convert(n/2));
   }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter any number");
     int n=obj.nextInt();
     System.out.println(demo.convert(n));
   }
}