//program to demonstrate interning of String objects.

class Test
{
  public static void main(String args[])
    {
       String s1=new String("abc");
       String s2=s1.concat("def");
       String s3=s2.intern();
       String s4="abcdef";
       System.out.println(s3==s4);//true
    }
}


/*
heap ----> 2
scp -----> 3
total ---> 5 */