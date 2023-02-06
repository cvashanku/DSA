//Implement a program to find sum of digits present in the given number?

import java.util.*;

class demo
{
  static int sumofn(int n)
  {
    if(n==0)
       return 0;
    else
       return (n%10)+sumofn(n/10);
  }
}
class test 
{
   public static void main(String[] args) 
   {
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter n value:");
     int n = obj.nextInt();
     System.out.println(demo.sumofn(n));
    }
}
