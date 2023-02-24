//reverse the stack

import java.util.*;
class Test
{
  public static void bottomInsert(Stack<Integer> s,int value)
  {
    int temp;
    if(s.empty())
       s.push(value);
    else
    {
      temp=s.pop();
      bottomInsert(s,value);
      s.push(temp);
    }
  }

  public static void reverseStack(Stack<Integer> s)
  {
    int temp;
    if(s.empty())
       return;
    else
    {
      temp=s.pop();
      reverseStack(s);
      bottomInsert(s,temp);
    }
  }

  public static void main(String args[])
  {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println(s);//[1, 2, 3, 4, 5]
    reverseStack(s);
    System.out.println(s);//[5, 4, 3, 2, 1]
  }
}