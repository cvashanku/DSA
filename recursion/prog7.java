//Implement a program to calculate a^b (a to the power b)

import java.util.*;

class demo
{
  static int power(int a,int b)
   {
     if(b>=1)
         return a*power(a,b-1);
     else
        return 1;
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
    System.out.println(demo.power(a,b));
  }
}