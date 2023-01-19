//program to demonstrate reference and content comparision in StringBuffer class

class Test
{
  public static void main(String args[])
    {
      StringBuffer s1=new StringBuffer("shankar");
      StringBuffer s2=new StringBuffer("shankar");
      StringBuffer s3=s1;

      System.out.println(s1==s2);//false
      System.out.println(s1.equals(s2));//false

      System.out.println(s1==s3);//true
      System.out.println(s1.equals(s3));//true
    }
}