//implement program to validate given date

import java.util.regex.*;
import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter date value:");
     String s=obj.nextLine();
     System.out.println(s.matches("[0-3][0-9]-[0-1][012]-202[3-9]"));
   }
}