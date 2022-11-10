//Implement algorithm and program to find sum of n natural numbers.
import java.util.*;

class demo
{
  static int sum1(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
     {
       sum=sum+i;
     }
      return sum;
  }

  static int sum2(int n)
   {
    if(n==1)
      return 1;
    else
      return n+sum2(n-1);
   }

  static int sum3(int n)
   {
     return n*(n+1)/2;
   }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter any number:");
     int n=obj.nextInt();
     System.out.println(demo.sum1(n));
     System.out.println(demo.sum2(n));
     System.out.println(demo.sum3(n));
   }
}


/*
  Algorithm:
  ----------
			1. read 'n' value from the user.
			2. apply business logic

			logic1:
					//loops
					sum=0;
					for(i=0;i<=n;i++)
					{
						sum=sum+i;
					}
			logic2:
					//recursion
					int sum(int n)
					{
						if(n==0)
							return 0;
						else
							return n+sum(n-1);
					}
			logic3:
					//math formula
					n*(n+1)/2

			3. print the result
*/