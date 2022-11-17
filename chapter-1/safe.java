import java.util.*;

class Demo
{
	static ArrayList getFibSeq(int n)
	{
		ArrayList al = new ArrayList();
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

class Test
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=obj.nextInt();

		System.out.println(Demo.getFibSeq(n));
	}
}
