//implementation of stack by using predefined class (java.util.Stack)
//general implementation

import java.util.*;
class Test
{
  public static void main(String args[])
  {
    Stack s=new Stack();
    System.out.println(s);//[]
    System.out.println(s.empty());//true
    s.push(111);
    s.push(222);
    s.push(333);
    s.push(444);
    s.push(555);
    System.out.println(s.empty());//false
    System.out.println(s);//[111,222,333,444,555]
    System.out.println(s.peek());//555
    System.out.println(s.search(111));//5
    System.out.println(s.search(555));//1
    System.out.println(s.search(999));//-1
    System.out.println(s.pop());//555
    System.out.println(s);//[111,222,333,444]
  }
}