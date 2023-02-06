//StringBuffer(String); it creates sb obj with given string capacity = 16 + len of str

class Test
{
   public static void main(String args[])
    {
       StringBuffer sb=new StringBuffer("abc");
       System.out.println(sb);//abc
       System.out.println(sb.length());//3
       System.out.println(sb.capacity());//16+3=19
    }
}