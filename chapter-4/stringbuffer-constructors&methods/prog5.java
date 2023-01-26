//if max capacity is readched then string buffer capacity will be automatically increased based on the following formula.
//new capacity = (old capacity+1)*2

class Test
{
  public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb);//
      System.out.println(sb.length());//0
      System.out.println(sb.capacity());//16
      sb.append("abcdefghijklmnop");
      System.out.println(sb);//abcdefghijklmnop
      System.out.println(sb.length());//16
      System.out.println(sb.capacity());//16
      sb.append("q");
      System.out.println(sb);//abcdefghijklmnopq
      System.out.println(sb.length());//17
      System.out.println(sb.capacity());//(16+1)*2=34
    }
}