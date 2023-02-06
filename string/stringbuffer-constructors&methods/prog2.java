//StringBuffer(); it creates a new StringBuffer object with 16 as default capacity

class Test
{
   public static void main(String args[])
     {
       StringBuffer sb=new StringBuffer();
       System.out.println(sb);//
       System.out.println(sb.length());//0
       System.out.println(sb.capacity());//16
     }
}