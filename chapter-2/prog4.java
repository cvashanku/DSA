//Implement a program to print natural numbers from 1 to n

import java.util.*;

class demo
{
	static void print(int n)
	{
		if(n>=1)
		{
			System.out.print(n+" ");
			 print(n-1);
		}
	}
}

class test 
{
	public static void main(String args[]) 
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter n value:");
		int n = obj.nextInt();
		demo.print(n);
	}
}
