//implementation of stack by using predefined class (java.util.Stack)
//Sorting of Stack

import java.util.*;
class Test
{
  public static void sortedInsert(Stack<Integer> s,int value)
  {
    int temp;
    if(s.empty() || value>s.peek())
       s.push(value);
    else
    {
      temp=s.pop();
      sortedInsert(s,value);
      s.push(temp);
    }
  }

  public static void sortStack(Stack<Integer> s)
  {
    int temp;
    if(s.empty()==false)
    {
      temp=s.pop();
      sortStack(s);
      sortedInsert(s,temp);
    }
  }

  public static void main(String args[])
  {
    Stack<Integer> s=new Stack<>();
    s.push(5);
    s.push(3);
    s.push(1);
    s.push(4);
    s.push(2);
    System.out.println(s);//[5,3,1,4,2]
    sortStack(s);
    System.out.println(s);//[1,2,3,4,5]
  }
}