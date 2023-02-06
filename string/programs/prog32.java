//implement program to validate student university hall ticket number
//DSxxxx ---> "DS[0-9]{4}"

import java.util.regex.*;
import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter halltick number");
     String s=obj.nextLine();
     System.out.println(s.matches("DS[0-9]{4}"));
   }
}