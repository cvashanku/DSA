/*
Impl prg to validate ATM pin number.
------------------------------------
1) it should contains 4 characters
2) all these 4 characters should be digits

[0-9]{4}
*/

import java.util.regex.*;
import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter atm pin:");
     String s=obj.nextLine();
     System.out.println(s.matches("[0-9]{4}"));
   }
}