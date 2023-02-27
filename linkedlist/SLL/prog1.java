class SLL
{
  Node head;
  int size;

  class Node
  {
    int data;
    Node next;
    
    Node(int data)
    {
      this.data=data;
      this.next=next;
      size++;
    }
  }

  void traverse()
  {
    if(head==null)
     {
       System.out.println("SLL is empty");
       return;
     }
     Node currNode=head;
     while(currNode!=null)
      {
        System.out.print(currNode.data+"==>");
        currNode=currNode.next;
      }
      System.out.println("null");
  }

  void addFirst(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
     {
       head=newNode;
       return;
     }
     newNode.next=head;
     head=newNode;
  }

  void addLast(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
     {
       head=newNode;
       return;
     }
     Node currNode=head;
     while(currNode.next!=null)
      {
        currNode=currNode.next;
      }
      currNode.next=newNode;
  }

  void addPos(int data,int pos)
  {
    int i=0;
    Node newNode=new Node(data);
    if(head==null)
     {
       head=newNode;
       return;
     }
     if(pos<0 || pos>=size-1)
     {
       System.out.println("out of range");
       return;
     }
     if(pos!=0)
     {
       Node currNode=head,temp=null;
       while(currNode.next!=null && i<pos)
        {
          temp=currNode;
          currNode=currNode.next;
          i++;
        }
        temp.next=newNode;
        newNode.next=currNode;
     }
     else
     {
       newNode.next=head;
       head=newNode;
     }
  }

  void sortedInsertAsc(int data)
  {
    Node newNode=new Node(data);
    Node currNode=head;
    if(currNode==null || currNode.data>data)
    {
       newNode.next=head;
       head=newNode;
       return;
    }
    while(currNode.next!=null && currNode.next.data<data)
        currNode=currNode.next;
    newNode.next=currNode.next;
    currNode.next=newNode;
  }

  void sortedInsertDesc(int data)
  {
    Node newNode=new Node(data);
    Node currNode=head;
    if(currNode==null || currNode.data<data)
    {
       newNode.next=head;
       head=newNode;
       return;
    }
    while(currNode.next!=null && currNode.next.data>data)
        currNode=currNode.next;
    newNode.next=currNode.next;
    currNode.next=newNode;
  }

  int getSize()
  {
    return this.size;
  }

  boolean search(int data)
  {
    Node currNode=head;
    while(currNode!=null)
    {
      if(currNode.data==data)
        return true;
      currNode=currNode.next;
    }
    return false;
  }

  void deleteFirst()
  {
    if(head==null)
    {
      System.out.println("SLL is empty");
      return;
    }
    size--;
    head=head.next;
  }

  void deleteLast()
  {
    if(head==null)
    {
      System.out.println("SLL is empty");
      return;
    }
    if(head.next==null)
    {
      head=null;
      size--;
      return;
    }
    size--;
    Node temp1=head,temp2=head.next;
    while(temp2.next!=null)
    {
      temp2=temp2.next;
      temp1=temp1.next;
    }
    temp1.next=null;
  }

  void deletePos(int pos)
  {
    Node temp=head;
    int i=0;
    if(temp==null)
    {
      System.out.println("SLL is empty");
      return;
    }
    if(pos==0)
    {
      head=head.next;
      size--;
      return;
    }
    if(pos<0 || pos>size-1)
    {
      System.out.println("out of range");
      return;
    }
    while(temp.next!=null && i<pos)
    {
      if(i==pos-1)
      {
        temp.next=temp.next.next;
        size--;
        return;
      }
      i++;
      temp=temp.next;
    }
  }
  
  void deleteElement(int value)
  {
    Node temp=head;
    if(temp==null)
    {
      System.out.println("SLL is empty");
      return;
    }
    if(temp.data==value)
    {
      head=head.next;
      size--;
      return;
    }
    while(temp.next!=null)
    {
      if(temp.next.data==value)
      {
        temp.next=temp.next.next;
        size--;
        return;
      }
      temp=temp.next;
    }
  } 

  void deleteElements(int value)
  {
    Node temp=head;
    if(temp==null)
    {
      System.out.println("SLL is empty");
      return;
    }
    if(temp.data==value)
    {
      head=head.next;
      size--;
    }
    while(temp.next!=null)
    {
      if(temp.next.data==value)
      {
        temp.next=temp.next.next;
        size--;
      }
      if(temp.next!=null)
        temp=temp.next;
    }
  }   

}

class Test
{
  public static void main(String args[])
   {
     SLL list=new SLL();
     list.addLast(111);
     list.addLast(444);
     list.addLast(333);
     list.addLast(444);
     list.addLast(555);
     list.addLast(666);
     list.addLast(444);
     list.traverse();
     list.deleteElements(444);
     list.traverse();
   }
}