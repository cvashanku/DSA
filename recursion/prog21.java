// Implement a program to remove the given character from a string?

import java.util.*;

class demo
{
  static String strremove(String s,int index)
   {
     if(index<0)
       return "";
      else if(s.charAt(index)=='x')
         return strremove(s,index-1);
      else
         return strremove(s,index-1)+s.charAt(index);
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string");
    String s=obj.nextLine();
    System.out.println(demo.strremove(s,s.length()-1));
  }
}