//Bottom Insertion of Stack

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
 
  public static void main(String args[])
  {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println(s);//[1,2,3]
    bottomInsert(s,888);
    System.out.println(s);//[888,1,2,3]
    bottomInsert(s,999);
    System.out.println(s);//[999,888,1,2,3]
  }
}