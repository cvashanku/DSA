//String[] split(delimiter) ----> it divides the given string into tokens based on deli

import java.util.Arrays;

class Test
{
   public static void main(String args[])
     {
        String s="java is very easy";
        String s1[]=s.split("");
        System.out.println(Arrays.toString(s1));//[j, a, v, a,  , i, s,  , v, e, r, y,  , e, a, s, y]
        String s2[]=s.split(" ");
        System.out.println(Arrays.toString(s2));//[java, is, very, easy]
        String s3[]=s.split("a");
        System.out.println(Arrays.toString(s3));//[j, v,  is very e, sy]
     }
}