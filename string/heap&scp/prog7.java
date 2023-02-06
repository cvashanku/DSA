class Test
{
  public static void main(String args[])
    {  
      String s1=new String("abc");
      String s2=s1.toString();
      String s3=s1.toUpperCase();
      String s4=s1.toLowerCase();
      String s5=s1.toUpperCase();
      String s6=s3.toLowerCase();
      System.out.println(s1==s2);//true
      System.out.println(s1==s4);//true
      System.out.println(s3==s5);//false
      System.out.println(s1==s6);//false
    }
}



/*
heap ----> 4
scp -----> 1
total ---> 5

Note:
-----
1) because of runtime operation if there is a change in the content with those changes a new object will be created on heap area but not on scp.

2) if there is no change in the content no new obj will be created the same obj will be reused. this rule is applicable for both scp and heap areas. */