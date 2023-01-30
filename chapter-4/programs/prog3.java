//implement program to read String and print characters present at odd index values.

class Test
{
  public static void main(String args[])
    {
      String s="welcome";
      System.out.println(s);
      for(int i=0;i<s.length();i++)
        {
           if(i%2!=0)
              System.out.println("index:"+i+" and char:"+s.charAt(i));
        }
    }
}