//program to creates String object with given StringBuilder and StringBuffer

class Test
{
  public static void main(String args[])
    {
       StringBuffer sb1=new StringBuffer("abcd");
       StringBuilder sb2=new StringBuilder("ABCD");
       String s1=new String(sb1);
       String s2=new String(sb2);
       System.out.println(sb1);//abcd
       System.out.println(sb2);//ABCD
       System.out.println(s1);//abcd
       System.out.println(s2);//ABCD
    } 
}