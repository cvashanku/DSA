//Linear probing implementation

import java.util.*;
class Hashtable
{
  int size;
  int a[];
  Hashtable(int size)
   {
     this.size=size;
     a=new int[this.size];
     for(int i=0;i<size;i++)
      a[i]=-1;
   }

  int compute(int value)
   {
     return value%size;
   }
  int compute1(int index)
   {
     return index;
   }
  boolean add(int value)
   {
     int hcode=compute(value);
     for(int i=0;i<size;i++)
      {
        if(a[hcode]==-1)
         {
           a[hcode]=value;
           return true;
         }
         hcode=hcode+compute1(i);
         hcode=hcode%size;
      }
      return false;
   }
  
  boolean search(int value)
   {
     int hcode=compute(value);
     for(int i=0;i<size;i++)
      {
        if(a[hcode]!=-1 && a[hcode]==value)
           return true;
        hcode=hcode+compute1(i);
        hcode=hcode%size;
      }
      return false;
   }

  boolean remove(int value)
   {
     int hcode=compute(value);
     for(int i=0;i<size;i++)
      { 
        if(a[hcode]!=-1 && a[hcode]==value)
         {
           a[hcode]=-1;
           return true;
         }
         hcode=hcode+compute1(i);
         hcode=hcode%size;
      }
      return false;
   }

  void print()
   {
     System.out.println("content of hash table");
     for(int i=0;i<size;i++)
      {
        System.out.println(i+"====>"+a[i]);
      }
   }
}

class Test
{
  public static void main(String args[])
   {
     Hashtable hs=new Hashtable(10);
     System.out.println(hs.add(3));//true
     System.out.println(hs.add(13));//true
     System.out.println(hs.add(23));//true
     System.out.println(hs.add(33));//true
     System.out.println(hs.add(43));//true
     System.out.println(hs.add(53));//true
     System.out.println(hs.add(63));//false
     hs.print();
     System.out.println(hs.search(53));//true
     System.out.println(hs.search(63));//false
     System.out.println(hs.remove(53));//true
     System.out.println(hs.remove(63));//false
     hs.print();
   }
}