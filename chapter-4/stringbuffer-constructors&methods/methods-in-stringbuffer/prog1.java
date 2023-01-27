/*
1) int length() ----> return num of char present in sb
2) int capacity() --> returns max num of char that sb can allow
3) void setLength(int) ---> it sets the length of sb object
4) void trimToSize() -----> it removes unwanted spaces in sb
5) void ensureCapacity(int) -> it increase capacity manually
*/


class Test
{
  public static void main(String args[])
    {
       StringBuffer sb=new StringBuffer("welcome");
       System.out.println(sb);//welcome
       System.out.println(sb.length());//7
       System.out.println(sb.capacity());//16+7=23
       sb.setLength(2);
       System.out.println(sb);//we
       System.out.println(sb.length());//2
       System.out.println(sb.capacity());//23
       sb.trimToSize();
       System.out.println(sb);//we
       System.out.println(sb.length());//2
       System.out.println(sb.capacity());//2
       sb.ensureCapacity(55);
       System.out.println(sb);//we
       System.out.println(sb.length());//2
       System.out.println(sb.capacity());//55
    }
}








