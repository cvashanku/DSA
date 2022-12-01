//Implement a program to return Str, where all the adjacent chars are sep by a "*".

import java.util.*;

class demo
{
  static String news(String s,int index)
   {
     if(index<1)
         return ""+s.charAt(index);
      else
       return news(s,index-1)+"*"+s.charAt(index);
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string:");
    String s=obj.nextLine();
    System.out.println(demo.news(s,s.length()-1));
  }
}