//program to convert given string into char[]

import java.util.Arrays;
class Test
{
   public static void main(String args[])
     {
        String s=new String("shankar");
        System.out.println(s);//shankar
        char[] ch=s.toCharArray();
        System.out.println(Arrays.toString(ch));
     }
}