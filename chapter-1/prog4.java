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
  static void swap2(int a,int b)
   {
    System.out.println("before swaping a="+a+" and b="+b);
      a=a+b;
      b=a-b;
      a=a-b;
    System.out.println("after swaping a="+a+" and b="+b);
   }
  static void swap3(int a,int b)
   {
    System.out.println("before swaping a="+a+" and b="+b);
      a=a*b;
      b=a/b;
      a=a/b;
    System.out.println("after swaping a="+a+" and b="+b);
   }
  static void swap4(int a,int b)
   {
    System.out.println("before swaping a="+a+" and b="+b);
      a=a^b;
      b=a^b;
      a=a^b;
    System.out.println("after swaping a="+a+" and b="+b);
   }
  static void swap5(int a,int b)
   {
    System.out.println("before swaping a="+a+" and b="+b);
      a=a+b-(b=a);
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
   demo.swap2(a,b);
   demo.swap3(a,b);
   demo.swap4(a,b);
   demo.swap4(a,b);
  }
}


/*
 Algorithm:
----------
			1. read a and b values from the user.
			2. print before swaping values of a and b
			3. apply business logic for swaping
			   logic1:
			   logic2:
			   logic3:
			   logic4:
			   logic5:
			4. print after swaping values of a and b
*/