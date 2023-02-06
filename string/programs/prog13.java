//implement program to divide the strings seperated by spaces/comma

import java.util.*;
class Test
{
  public static void main(String args[])
    {
       String s="the quick brown fox jumps over the lazy dog";
       StringTokenizer st=new StringTokenizer(s);
       while(st.hasMoreTokens())
         {
             System.out.println(st.nextToken());
         } 
    }
}