//Implement a program to return new string where identical adjcent chars are sep by *

import java.util.*;

class demo
{
  static String news(String s,int index)
   {
     if(index<1)
         return ""+s.charAt(index);
     if(s.charAt(index)==s.charAt(index-1))
         return news(s,index-1)+"*"+s.charAt(index);
     else
         return news(s,index-1)+s.charAt(index);
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