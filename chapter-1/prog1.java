//addition of two numbers
import java.util.*;
class demo
{
  static int addition(int a,int b)
  { 
   return a+b;
  }
}
class test
{
  public static void main(String args[])
  { 
       Scanner obj=new Scanner(System.in);
       System.out.println("enter first number:");
       int a=obj.nextInt();
       System.out.println("enter second number:");
       int b=obj.nextInt();
       System.out.println(demo.addition(a,b));
  }
}

/*
algorithm:
         1. read two numbers from the user.
			//business logic starts
			2. use arithmetic operators to cal result/addition
			3. c = a+b
			//business logic ends
			4. print the result to the console(screen), file, database
*/