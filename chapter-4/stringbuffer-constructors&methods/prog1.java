//if the content is fixed not changing in our program ---> String
//if the content is not fixed keep on changing ----------> StringBuffer or StringBuilder

class Test
{
  public static void main(String args[])
    {
       StringBuffer s=new StringBuffer("abc");
       s.append("def");
       System.out.println(s);//abcdef
    }
}