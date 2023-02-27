//balanced parenthesis

import java.util.*;
class Test
{
  public static boolean isBalancedParenthesis(String ss)
  {
    Stack<Character> s=new Stack<>();
    for(char ch:ss.toCharArray())
    {
      switch(ch)
      {
        case '{':
        case '[':
        case '(':s.push(ch);break;
        
        case '}':
                  if(s.pop()!='{')
                     return false;
                   break;
        case ']':
                  if(s.pop()!='[')
                     return false;
                   break;
        case ')':
                  if(s.pop()!='(')
                     return false;
                   break;
      }
    }
    return s.empty();
  }

  public static void main(String args[])
  {
    System.out.println(isBalancedParenthesis("[]"));//true
    System.out.println(isBalancedParenthesis("[()]"));//true
    System.out.println(isBalancedParenthesis("{[()]}"));//true
    System.out.println(isBalancedParenthesis("[{(}]"));//false
    System.out.println(isBalancedParenthesis("["));//false
  }
}