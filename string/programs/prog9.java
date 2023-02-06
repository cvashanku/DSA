//implement program to sort all the characters in descending order.

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
       //manual logic 
       char[] ch2=new char[ch.length];
       int j=0;
       for(int i=ch.length-1;i>=0;i--)
         ch2[j++]=ch[i];
       System.out.println(Arrays.toString(ch2));
       String ss=new String(ch2);
       System.out.println(ss);
    }
}