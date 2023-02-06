//implement program to check whether the given strings are anagrams or not

import java.util.*;
class Test
{
  public static void main(String args[])
    {
       String s1="race";
       String s2="care";
       String s3="cary";
       
       char[] ch1=s1.toCharArray();
       char[] ch2=s2.toCharArray();
       char[] ch3=s3.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);
       Arrays.sort(ch3);

       System.out.println(Arrays.equals(ch1,ch2));//true
       System.out.println(Arrays.equals(ch1,ch3));//false
    }
}