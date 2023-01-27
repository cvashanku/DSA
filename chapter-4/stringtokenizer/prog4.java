/*
int countTokens()  ------> num of tokens existed
boolean hasMoreTokens() -> return true if there is a token
String nextToken() ------> return current token and transfers to net token
*/

import java.util.StringTokenizer;
class Test
{
  public static void main(String args[])
   {
      String s="12:05:34";
      StringTokenizer st=new StringTokenizer(s,":");
      System.out.println(st.countTokens());//3
      while(st.hasMoreTokens())
        {
          System.out.println(st.nextToken());
        }
   }
}