//program to demonstarte predefined character classes
////s=space character
import java.util.regex.*;

class Test
{
  public static void main(String args[])
    {
      Pattern p=Pattern.compile("\\s");//regular expression
      Matcher m=p.matcher("ab c$123#i Jk^45 6*pQr @ wXYz");//target string
      int c=0;
      while(m.find())
        {
          System.out.println(m.start()+"=====>"+m.end()+"====>"+m.group());
          c++;
        }
          System.out.println(c);
    }
}