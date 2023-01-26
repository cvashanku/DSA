//String substring(int) -----> returns substring from the given location
//String substring(int,int) -> returns substring from start index to end index-1

class Test
{
  public static void main(String args[])
    {
       String s="welcome to java and python";
       System.out.println(s);//welcome to java and python
       System.out.println(s.substring(11));//java and python
       System.out.println(s.substring(11,15));//java
    }
}