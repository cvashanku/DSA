//program to demonstrate quantifiers
//a{m}---------->exactly 'm' number of a's

import java.util.regex.*;
class Test
{
  public static void main(String args[])
    {
       Pattern p=Pattern.compile("a{3}");//regular expression
       Matcher m=p.matcher("abaabaaabaaaabaaaaabaaaaaab");//target string
       int c=0;
       while(m.find())
         {
           System.out.println(m.start()+"====>"+m.end()+"====>"+m.group());
           c++;
         }
          System.out.println(c);
    }
}