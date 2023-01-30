//implement program to sort all the characters in ascending order.

import java.util.*;
class Test
{
  public static void main(String args[])
    {
       String s="welcome";
       char[] ch=s.toCharArray();
       System.out.println(s);
       System.out.println(Arrays.toString(ch));
       Arrays.sort(ch);
       System.out.println(Arrays.toString(ch));
       String ss=new String(ch);
       System.out.println(ss);
    }
}