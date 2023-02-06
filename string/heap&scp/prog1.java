//program to demonstrate Heap and Scp Area

class Test
{
  public static void main(String args[])
    {
      String s1=new String("abc");
      String s2=new String("abc");
      String s3="abc";
      String s4="abc";
      System.out.println(s1==s2);//false
      System.out.println(s3==s4);//true
    }
}

/*
heap ----> 2
scp -----> 1
total ---> 3*/