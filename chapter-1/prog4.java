//Implement algorithm and program to swap given two integers
import java.util.*;

class demo
{
  static void swap1(int a,int b)
  {
   System.out.println("before swaping a="+a+" and b="+b);
   int temp;
   temp=a;
   a=b;
   b=temp;
   System.out.println("after swaping a="+a+" and b="+b);
  }
}

class test
{
  public static void main(String args[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter a number:");
   int a=obj.nextInt();
   System.out.println("enter b number:");
   int b=obj.nextInt();
   demo.swap1(a,b);
  }
}