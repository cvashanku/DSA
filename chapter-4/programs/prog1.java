//implement program to read string and print char and corresponding index value.

class Test
{
  public static void main(String args[])
    {
       String s="welcome";
       System.out.println(s);
       for(int i=0;i<s.length();i++)
         {
            System.out.println("index:"+i+" and char:"+s.charAt(i));
         }
    }
}