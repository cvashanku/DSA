//StringBuffer(int); it creates a new StringBuffer object with capacity as given int

class Test
{
  public static void main(String args[])
    {
       StringBuffer sb=new StringBuffer(50);
       System.out.println(sb);//
       System.out.println(sb.length());//0
       System.out.println(sb.capacity());//50
    }
}