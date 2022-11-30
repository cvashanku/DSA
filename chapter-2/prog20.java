//Implement a program to find reverse of the given string using recursion?

import java.util.*;

class demo
{
  static String strrev(String s)
   {
     if(s==null || s.length()<=1)
        return s;
     else
        return strrev(s.substring(1)) + s.charAt(0);
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string:");
    String s=obj.nextLine();

    System.out.println(demo.strrev(s));
  }
}