//implement program to check whether the given string is paliandrome or not

import java.util.*;
class Test
{
   public static void main(String args[])
    {
      String s="madam";
      String ss=new StringBuffer(s).reverse().toString();
      System.out.println(s.equals(ss));//true
    }
}