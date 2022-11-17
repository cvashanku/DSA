//Implement algorithm and program to generate fibanocci sequence.

import java.util.*;
class demo
{
  static ArrayList getFibSeq(int n)
  {
    ArrayList al=new ArrayList();
    int a=0,b=1,i,c;
    al.add(a);
    al.add(b);
    for(i=1;i<=n-2;i++)
     {
       c=a+b;
       al.add(c);
       a=b;
       b=c;
     }
    return al;
  }
}

class test
{
  public static void main(String args[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number of elements:");
   int n=obj.nextInt();
  
   System.out.println(demo.getFibSeq(n));
  }
}

/*
Algorithm:
----------
			1. read 'n' value from the user.
			2. create array list objects [container which hold all numbers]
			3. push all the calcualted fib value into array list

			logic:
					a = 0
					b = 1
					al.add(a);
					al.add(b);[0,1]
					for(i=1;i<=n-2;i++)
					{
						c=a+b;
						al.add(c);
						a=b;
						b=c;
					}

			4. print array list   */