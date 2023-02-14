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

}

class Test
{
  public static void main(String args[])
   {
     SLL list=new SLL();
     list.addLast(111);
     list.addLast(222);
     list.addFirst(18);
     list.addLast(333);
     list.addLast(444);
     list.addLast(555);
     list.traverse();
     list.addPos(7,6);
     list.addPos(45,3);
     list.traverse();
   
   }
}