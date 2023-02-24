//implementation of stack by using predefined class (java.util.Stack)
//Stack class to hold string object

import java.util.*;
class Test
{
  public static void main(String args[])
  {
    Stack<String> s=new Stack<>();    
    System.out.println(s);//[]
    System.out.println(s.empty());//true
    s.push("AAA");
    s.push("BBB");
    s.push("CCC");
    s.push("DDD");
    s.push("EEE");
    System.out.println(s.empty());//false
    System.out.println(s);//[AAA,BBB,CCC,DDD,EEE]
    System.out.println(s.peek());//EEE
    System.out.println(s.search("AAA"));//5
    System.out.println(s.search("CCC"));//3
    System.out.println(s.search("FFF"));//-1
    System.out.println(s.pop());//EEE
    System.out.println(s);//[AAA,BBB,CCC,DDD]
  }
}