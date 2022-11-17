//Implement algorithm and program to find whether given number is prime or not.
import java.util.*;

class demo
{
 static boolean isprime1(int n)
 {
    int i,factors=0;
    for(i=1;i<=n;i++)
     {
       if(n%i==0)
         factors++;
     }
     return factors==2;
  }
  
  static boolean isprime2(int n,int i)
  {
    if(i==1)
      return true;
    else if(n%i==0)
      return false;
    else
      return isprime2(n,--i);
       
  }
}

class test
{
 public static void main(String args[])
 {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter any number:");
   int n=obj.nextInt();
   System.out.println((demo.isprime1(n))?"prime number":"not a prime number");
   System.out.println((demo.isprime2(n,n/2))?"prime number":"not a prime number");
 }
}

/*
   Algorithm:

			1. read 'n' value from the user
			2. apply business logic and check whether it is prime or not

			logic1: by using loops
			----------------------
			factors=0;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
					factors++;
			}
			if(factors==2)
				print Yes
			else
				print No

			logic2: by using recursion
			--------------------------
			int isprime(int n,int i)
			{
				if(i==1)
					return true;
				else if(n%i==0)
					return false;
				else
					return isprime(n,--i);
			}

			3. print the result (Yes/No)
*/
