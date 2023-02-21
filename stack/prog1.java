//implementation of stack by using arrays

import java.util.*;

class StackArray
{
  int capacity=5;
  int[] data;
  int top=-1;

  StackArray()
  {
    data=new int[capacity];
  }

  boolean isEmpty()
  {
    return top==-1;
  }
  
  int getSize()
  {
    return (top+1);
  }

  void print()
  {
    if(isEmpty())
    {
      System.out.println("stack under flow");
      return;
    }
    else
    {
      for(int i=0;i<=top;i++)
         System.out.print(data[i]+" ");
      System.out.println();
    }
  }

  void push(int value)
  {
    if(getSize()==data.length)
    {
      System.out.println("stack over flow");
      return;
    }
    top++;
    data[top]=value;
  }

  int pop()
  {
    if(isEmpty())
    {
      System.out.println("stack is under flow");
      return -1;
    }
    int delvalue=data[top];
    top--;
    return delvalue;
  } 

  int peek() 
  {
    if(isEmpty())
    {
      System.out.println("under flow");
      return top;
    }
    return data[top];
  }

  boolean search(int value)
  {
    if(isEmpty())
    {
      System.out.println("Under Flow");
      return false;
    }
    for(int i=0;i<=top;i++)
    {
      if(data[i]==value)
        return true;
    }
    return false;
  }

}

class Test
{
  public static void main(String args[])
  {
    StackArray s=new StackArray();
    System.out.println(s.isEmpty());//true
    System.out.println(s.getSize());//0
    s.print();//stack under flow
    s.push(111);
    s.push(222);
    s.push(333);
    s.push(444);
    s.push(555);
    s.push(666);//stack over flow
    System.out.println(s.isEmpty());//false
    System.out.println(s.getSize());//5
    s.print();//111 222 333 444 555 
    System.out.println(s.peek());//555
    System.out.println(s.peek());//555
    s.print();//111 222 333 444 555
    System.out.println(s.search(555));//true
    System.out.println(s.search(999));//true
  }
}