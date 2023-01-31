//implement program to check whether the given string is pangram or not
//pangram: all english alphabets should be there in that string

import java.util.*;
class Test
{
  public static void main(String args[])
    {
       String s="the quick brown fox jumps over the lazy dog";
       boolean flag=true;
       for(int i='a';i<='z';i++)
         {
           if(s.indexOf(i)<0)
             {
               flag=false;
               break;
             }
         }
        System.out.println(flag);
    }
}