//implement program to convert every word except first and last char remaining into caps

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     String s="the quick brown fox jumps over the lazy dog";
     StringBuffer sb=new StringBuffer();
     System.out.println(s);
     StringTokenizer st=new StringTokenizer(s);
     while(st.hasMoreTokens())
     {
       String ss=st.nextToken();
       int n=ss.length();
       sb.append(ss.substring(0,1)+ss.substring(1,n-1).toUpperCase()+ss.substring(n-1,n));
       sb.append(" ");
     }
     System.out.println(sb);
    }
}