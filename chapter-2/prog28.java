//IMP to replace the given string with new string?

import java.util.*;

class demo
{
  static String replace(String s,int index)
   {
      if(index<1)
          return s.substring(0,index+1);
      if(s.substring(index-1,index+1).equals("pi"))
          return replace(s,index-2)+"3.147";
      else
        return replace(s,index-1)+s.charAt(index);
   }
}

class test
{
 public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter any string:");
    String s=obj.nextLine();
    System.out.println(demo.replace(s,s.length()-1));
  }
} 