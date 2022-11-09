//Implement algorithm and program to find max of two numbers.[2 ways]
import java.util.*;
class demo
{
  static int max_version1(int a,int b)
  {
    return (a>b)?a:b;
  }
  static int max_version2(int a,int b)
  {
    return Math.max(a,b);
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
    System.out.println(demo.max_version1(a,b));
    System.out.println(demo.max_version2(a,b));
  }
}


/*
Algorithm:
          
		 1. read two numbers from the user.
		 2. apply the business logic and select max number.

		 	logic1:
		 			conditional operator
		 			(condition)?true_block:false_block
		 			(a>b)?a:b
		 	logic2:
		 			predefined methods
		 			Math.max(a,b); ---> max of a,b

		 3. print the result
*/