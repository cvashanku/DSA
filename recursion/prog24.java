//Implement a program to return true if a string nesting of zero or more pairs of ()


import java.util.*;

class demo
{
  static boolean validornot(String s,int i,int j)
   {
     if(i>j)
        return true;
     if(s.charAt(i)=='(' && s.charAt(j)==')')
        return validornot(s,i+1,j-1);
     else
        return false;
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string:");
    String s=obj.nextLine();
    System.out.println(demo.validornot(s,0,s.length()-1));
  }
}