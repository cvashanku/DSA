class Test
{
  public static void main(String args[])
    {
       String s=new String("abc");
       s.concat("def");
       s=s.concat("wxyz");
       System.out.println(s);//abcwxyz
    }
}


/*
heap -----> 3
scp ------> 3
total ----> 6 */