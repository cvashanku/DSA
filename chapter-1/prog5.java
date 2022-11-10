//Implement algorithm and program to check number is even or odd.
import java.util.*;

class demo
{
  static String isevenorodd(int n)
  {
    return (n%2==0)?"even number":"odd number";
  }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any number:");
    int n=obj.nextInt();
    System.out.println(demo.isevenorodd(n));
  }
}


/*
  Algorithm:
			1. read 'n' value from the user.
			2. apply the logic to check whether the given number is even or odd

			logic:
					(condition)?true:false

					(n%2==0)?"even number":"odd number"
*/