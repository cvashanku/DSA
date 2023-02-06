//Impl prg to return middle char(s).

import java.util.*;
class Test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      String s=obj.nextLine();
      int n=s.length();
      int mid=n/2;
      
      if(n%2==0)
         System.out.println(s.charAt(mid-1)+""+s.charAt(mid));
      else
         System.out.println(s.charAt(mid));
   }
}