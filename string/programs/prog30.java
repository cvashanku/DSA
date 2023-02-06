/*
Impl prg to validate mobile number
----------------------------------
R1: 10 digits
R2: first digit should be either 6 or 7 or 8 or 9
[6-9][0-9]{9}
[6-9]\\d{9}
*/

import java.util.regex.*;
import java.util.*;
class Test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter mobile number:");
      String s=obj.nextLine();
      System.out.println(s.matches("[6-9][0-9]{9}"));
      System.out.println(s.matches("[6-9]\\d{9}"));
   }
}