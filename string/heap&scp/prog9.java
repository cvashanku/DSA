//program to demonstrate interning of String objects

class Test
{
  public static void main(String args[])
    {
       String s1=new String("abc");
       String s2=s1.intern();
       String s3="abc";
       System.out.println(s2==s1);//false
       System.out.println(s2==s3);//true
    }
}

/*
by using heap reference if we want to get corresponding scp object,
 then we should go for intern method.
heap ----> 1
scp -----> 1
total ---> 2 */