//implement program to reverse individual words

import java.util.*;
class Test
{
  public static void main(String args[])
   {
      String s="the quick brown fox jumps over the lazy dog";
      System.out.println(s);
      StringTokenizer st=new StringTokenizer(s);
      
      while(st.hasMoreTokens())
        {
          System.out.print(new StringBuffer(st.nextToken()).reverse()+" ");
        }
   }
}