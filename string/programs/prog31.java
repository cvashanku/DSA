//implement program to validate gmail id

import java.util.regex.*;
import java.util.*;
class Test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter gmail id:");
      String s=obj.nextLine();
      System.out.println(s.matches("[a-z][a-zA-Z0-9][a-zA-Z0-9]+@gmail[.]com"));
   }
}