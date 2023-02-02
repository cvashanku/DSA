//implement program to reverse alternative words

import java.util.*;
class Test
{
  public static void main(String args[])
    {
      String s="the quick brown fox jumps over the lazy dog";
      StringBuffer sb=new StringBuffer();
      System.out.println(s);
      int i=0;
      StringTokenizer st=new StringTokenizer(s);
      while(st.hasMoreTokens())
       {
         String ss=st.nextToken();
         if(i%2==0)//(i%2!=0)
            sb.append(ss);
          else
            sb.append(new StringBuffer(ss).reverse());
            sb.append(" ");
            i++;
       }
       System.out.println(sb);
    }
}