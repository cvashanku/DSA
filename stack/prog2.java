//implementation of stack by using linked list(SLL)

import java.util.*;
class StackLL
{
  Node head=null;
  int size=0;
  class Node
  {
    int value;
    Node next;
    Node(int value,Node next)
    {
      this.value=value;
      this.next=next;
    }
  }

  int getSize()
  {
    return size;
  }  

  boolean isEmpty()
  {
    return size==0;
  }
  
  void print()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.value+"==>");
      temp=temp.next;
    }
    System.out.println("null");
  }

  void push(int value)
  {
    head=new Node(value,head);
    size++;
  }  

  int peek()
  {
    if(isEmpty())
      return -1;
    else
      return head.value;
  }
 
  int pop()
  {
    if(isEmpty())
    {
      System.out.println("stack is under flow");
      return -1;
    }
    int temp=head.value;
    head=head.next;
    return temp;
  }
}

class Test
{
  public static void main(String args[])
  {
    StackLL s=new StackLL();
    System.out.println(s.getSize());//0
    System.out.println(s.isEmpty());//true
    s.print();//null
    s.push(111);
    s.push(222);
    s.push(333);
    s.push(444);
    s.print();//444 333 222 111 null
    System.out.println(s.getSize());//4
    System.out.println(s.isEmpty());//false
    System.out.println(s.peek());//444
    s.print();//444 333 222 111 null
    System.out.println(s.pop());//444
    System.out.println(s.pop());//333
    System.out.println(s.pop());//222
    System.out.println(s.pop());//111    
    s.print();//null  
  }
}