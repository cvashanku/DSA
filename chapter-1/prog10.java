//Implement algorithm and program to generate tribonacci sequeue.
import java.util.*;

class demo
{
  static ArrayList getTribSeq(int n)
   {
     ArrayList al=new ArrayList();
     int a=0,b=1,c=2,d,i;
     al.add(a);
     al.add(b);	
     al.add(c);
     for(i=1;i<=n-3;i++)
      {
	d=a+b+c;
	al.add(d);
	a=b;
	b=c;
	c=d;
      }
	return al;
   }
}

class test
{
  public static void main(String args[])
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      int n=obj.nextInt();

      System.out.println(demo.getTribSeq(n));
   }
}