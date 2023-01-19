//program to demonstrate reference and content comparision in String class

class Test
{
  public static void main(String args[])
    {
       String s1=new String("Siva");
       String s2=new String("Siva");
       String s3=s1;

       System.out.println(s1==s2);//false
       System.out.println(s1.equals(s2));//true

       System.out.println(s1==s3);//true
       System.out.println(s1.equals(s3));//true      
    }
}