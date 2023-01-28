//program to demonstrate quantifiers
//a---------->exactly one a

import java.util.regex.*;
class Test
{
  public static void main(String args[])
    {
       Pattern p=Pattern.compile("a");//regular expression
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