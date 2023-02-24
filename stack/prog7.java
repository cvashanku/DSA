//implementation of stack by using predefined class (java.util.Stack)
//Sorted Insertion

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
 
  public static void main(String args[])
  {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(3);
    s.push(4);
    System.out.println(s);
    sortedInsert(s,2);//[1,3,4]
    System.out.println(s);//[1,2,3,4]
  } 
}