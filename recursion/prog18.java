//Implement a program to find LCM of two numbers?

import java.util.*;

class demo
{
  static int com=1;
  static int lcm(int n1,int n2)
   {
     if(com%n1==0 && com%n2==0)
         return com; 
     else     
        com++;
        return lcm(n1,n2);
   }
}

class test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter n1 value:");
     int n1=obj.nextInt();
     System.out.println("enter n2 value:");
     int n2=obj.nextInt();
     System.out.println(demo.lcm(n1,n2));
   }
}