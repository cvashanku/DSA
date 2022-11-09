//Implement algorithm and program to find max of three numbers.
import java.util.*;

class demo
{
	static int max_version1(int a,int b,int c){
		return (a>b && a>c)?a:(b>c?b:c);
	}

	static int max_version2(int a,int b,int c){
		return Math.max(Math.max(a,b),c);
	}
}

class test
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = obj.nextInt();
		System.out.println("Enter second number:");
		int b = obj.nextInt();
		System.out.println("Enter third number:");
		int c = obj.nextInt();
		System.out.println(demo.max_version1(a,b,c));
		System.out.println(demo.max_version2(a,b,c));
	}
}

/*
Algorithm:
----------

		 1. read three numbers from the user.
		 2. apply the business logic and select max number.

		 	logic1:
		 			conditional operator
		 			(condition)?true_block:((condition)?true_block:false_block)
		 			(a>b && a>c)?a:(b>c?b:c)
		 	logic2:
		 			predefined methods
		 			Math.max(Math.max(a,b),c); ---> max of a,b,c

		 3. print the result
*/