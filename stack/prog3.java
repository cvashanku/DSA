//toString() method implementation for stack

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
  
  boolean isEmpty()
  {
    return size==0;
  }

  void print()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.value+" ");
      temp=temp.next;
    }
    System.out.println("null");
  }

  void push(int value)
  {
    head=new Node(value,head);
    size++;
  }  
  
  public String toString()
  {
    Node temp=head;
    StringBuilder sb=new StringBuilder();
    sb.append("[");
    while(temp!=null)
    {
      if(temp.next!=null)
        sb.append(temp.value+", ");
      else
        sb.append(temp.value);
      temp=temp.next;
    }
    sb.append("]");
    return sb.toString();
  }

}

class Test
{
  public static void main(String args[])
  {
    StackLL s=new StackLL();
    s.push(111);
    s.push(222);
    s.push(333);
    s.push(444);
    s.print();//444 333 222 111 null
    System.out.println(s);//[444, 333, 222, 111]
  }
}