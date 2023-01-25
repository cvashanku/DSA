//program to convert given string into byte[]

import java.util.Arrays;

class Test
{
   public static void main(String args[])
     {
        String s=new String("shankar");
        System.out.println(s);//shankar
        byte[] b=s.getBytes();
        System.out.println(Arrays.toString(b));
     }
}