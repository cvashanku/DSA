class Test
{
  public static void main(String args[])
   {
      String s1=new String("i love my india");
      String s2=new String("i love my india");
      System.out.println(s1==s2);//false
      String s3="i love my india";
      System.out.println(s1==s3);//false
      String s4="i love my india";
      System.out.println(s3==s4);//true
      String s5="i love "+"my india";
      System.out.println(s4==s5);//true
      String s6="i love ";
      String s7=s6+"my india";
      System.out.println(s4==s7);//false
      final String s8="i love ";
      String s9=s8+"my india";
      System.out.println(s4==s9);
   }
}

/*
heap -----> 3
SCP ------> 3
total ----> 6 */