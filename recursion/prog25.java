//Implement a program to count number of times, the give char occurred.

import java.util.*;

class demo
{
  static int count(String s,char c,int index)
   {
      if(index<0)
        return 0;
      if(s.charAt(index)==c)
        return count(s,c,index-1)+1;
      else
        return count(s,c,index-1);
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string:");
    String s=obj.nextLine();
    System.out.println(demo.count(s,'x',s.length()-1));
  }
} 