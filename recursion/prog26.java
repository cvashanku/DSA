//IMP to replace the given old character with new character in the original string?

import java.util.*;

class demo
{
  static String replace(String s,char c,int index)
   {
      if(index<0)
        return "";
      if(s.charAt(index)==c)
        return replace(s,c,index-1)+"y";
      else
        return replace(s,c,index-1)+s.charAt(index);
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string:");
    String s=obj.nextLine();
    System.out.println(demo.replace(s,'x',s.length()-1));
  }
} 