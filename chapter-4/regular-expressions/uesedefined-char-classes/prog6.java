//program to demonstrate userdefined character classes
//[^a-z]------------->except lower case characters

import java.util.regex.*;

class Test
{
  public static void main(String args[])
    {
       Pattern p=Pattern.compile("[^a-z]");//regular expression
       Matcher m=p.matcher("ab c$123#i Jk^45 6*pQr @ wXYz");//target string
       int c=0;
       while(m.find())
         {
            System.out.println(m.start()+"====>"+m.end()+"====>"+m.group());
            c++;
         }
         System.out.println(c);
    }
}