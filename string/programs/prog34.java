//implement program to validate bike rgistration number
//TS 21 AB 1234

import java.util.regex.*;
import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter your bike number:");
     String s=obj.nextLine();
     System.out.println(s.matches("TS[0-2][0-9][A-Z]{2}[0-9]{4}"));
   }
}