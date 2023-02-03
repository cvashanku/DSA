//Impl prg to convert the given integer value into english word.
//123 ----> one two three

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter any number:");//123
     String s=obj.nextLine();
     for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        switch(ch)
         {
           case '0':System.out.print("zero ");break;
           case '1':System.out.print("one ");break;
           case '2':System.out.print("two ");break;
           case '3':System.out.print("three ");break;
           case '4':System.out.print("four ");break;
           case '5':System.out.print("five ");break;
           case '6':System.out.print("six ");break;
           case '7':System.out.print("seven ");break;
           case '8':System.out.print("eight ");break;
           case '9':System.out.print("nine ");break; 
         }
      }
   }
}