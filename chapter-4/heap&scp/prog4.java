class Test
{
  public static void main(String args[])
    {
       String s1="abc";
       String s2=s1.toUpperCase();
       String s3=s1.toLowerCase();
       System.out.println(s1==s2);//false
       System.out.println(s1==s3);//true
    }
}


/*
heap ----> 0
scp -----> 2
total ---> 2 */