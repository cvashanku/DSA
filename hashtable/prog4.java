//separate chaining implementation

import java.util.*;
class Hashtable
{
  int size;
  Node a[];
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
  Hashtable(int size)
  {
    this.size=size;
    a=new Node[this.size];
    for(int i=0;i<size;i++)
        a[i]=null;
  }
 
  int compute(int value)
  {
    return value%size;
  }

  void add(int value)
  {
    int hcode=compute(value);
    a[hcode]=new Node(value,a[hcode]);
  }

  boolean search(int value)
  {
    int hcode=compute(value);
    Node head=a[hcode];
    while(head!=null)
    {
      if(head.value==value)
         return true;
      head=head.next;
    }
    return false;
  }

  boolean remove(int value)
  {
    int hcode=compute(value);
    Node nextNode,head=a[hcode];
    if(head!=null && head.value==value)
     {
       a[hcode]=head.next;
       return true;
     }
     while(head!=null)
     {
       nextNode=head.next;
       if(nextNode!=null && nextNode.value==value)
        {
           head.next=nextNode.next;
           return true;
        }  
        else
           head=nextNode;
     }
     return false;
  }

  void print()
  {
    System.out.println("content of hash table");
    for(int i=0;i<size;i++)
     {
        Node head=a[i];
        while(head!=null)
        {
          System.out.print(head.value+"==>");
          head=head.next;
        }
        System.out.println("null");
     }
  }
}

class Test
{
  public static void main(String args[])
   {
     Hashtable hs=new Hashtable(10);
     hs.print();
     hs.add(13);
     hs.add(33);
     hs.add(53);
     hs.add(45);
     hs.add(22);
     System.out.println(hs.search(45));//true
     System.out.println(hs.search(13));//true
     System.out.println(hs.search(103));//false
     System.out.println(hs.remove(22));//true
     System.out.println(hs.remove(33));//true
     System.out.println(hs.remove(103));//false
     hs.print();
   }
}