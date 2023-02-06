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
      String s="java is very easy programming";
      StringTokenizer st=new StringTokenizer(s);
      System.out.println(st.countTokens());//5
      while(st.hasMoreTokens())
        {
          System.out.println(st.nextToken());
        }
   }
}