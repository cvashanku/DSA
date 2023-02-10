//Implementation Hashtable

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

  boolean add(int value)
   {
     int hcode=compute(value);
     if(a[hcode]==-1)
      {
        a[hcode]=value;
        return true;
      }
      return false;
   }

  boolean search(int value)
   {
     int hcode=compute(value);
     if(a[hcode]==value)
      return true;
      return false;
   }
  boolean remove(int value)
   {
     int hcode=compute(value);
     if(a[hcode]!=-1 && a[hcode]==value)
      {
        a[hcode]=-1;
        return true;
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
     Hashtable hs=new Hashtable(7);
     hs.print();
     System.out.println(hs.add(3));//true
     System.out.println(hs.add(12));//true
     System.out.println(hs.add(50));//true
     System.out.println(hs.add(91));//true
     System.out.println(hs.add(104));//true
     System.out.println(hs.add(177));//true
     System.out.println(hs.add(39));//true
     hs.print();
     System.out.println(hs.search(90));//false
     System.out.println(hs.search(91));//true
     System.out.println(hs.search(92));//false

     System.out.println(hs.remove(103));//false
     System.out.println(hs.remove(104));//true
     System.out.println(hs.remove(105));//false
     hs.print();
   }
} 