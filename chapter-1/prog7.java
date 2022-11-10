//Implement algorithm and program to find factorial of the given number.
import java.util.*;

class demo
{
  static int fact1(int n)
   {
     int f=1,i;
     for(i=1;i<=n;i++)
      {
        f=f*i;
      }
      return f;
   }
   
   static int fact2(int n)
    {
      if(n==0)
         return 1;
       else
         return n*fact2(n-1);
    }
}

class test
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any number:");
    int n=obj.nextInt();
    System.out.println(demo.fact1(n));
    System.out.println(demo.fact2(n));
  }
}


/* 
  Algorithm:
----------
			1. read 'n' value from the user
			2. apply business logic

			logic1:
			        fact=1;
			        for(i=1;i<=n;i++)
			        {
			        	fact=fact*i;
			        }
			logic2:
					int fact(int n)
					{
						if(n==0)
							return 1;
						else
							return n*fact(n-1);
					}

			3. print result
*/