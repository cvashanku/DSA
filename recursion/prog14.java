//Implement a program to calcualte reverse of the given number

import java.util.*;

class demo
{
   static int reverse(int n,int len)
    {
      if(n==0)
          return 0;
      else
          return((n%10)*(int)Math.pow(10,len-1))+reverse(n/10,--len);
    }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter any number:");
     String s=obj.nextLine();
     System.out.println(demo.reverse(Integer.parseInt(s),s.length()));
   }
}