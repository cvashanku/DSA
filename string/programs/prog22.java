/*
Rotate String 
-----------------
Given two strings s and ss, return true if and only if s can become ss after some number of shifts on s. A shift on s consists of moving the leftmost character of s to the rightmost position. 
For example, if s = "abcde", then it will be "bcdea" after one shift.

Ex:
---
	s = "abcde" 	ss = "bcdea" 	true 

	"abcde"
	"bcdea"
	"cdeab"
	"deabc"
	"eabcd"

	(s+s).contains(ss)
	("abcdeabcde").contains("bcdea")
*/

import java.util.*;
class Test
{
  public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      String s=obj.nextLine();
      String ss=obj.nextLine();
      
      System.out.println((s+s).contains(ss));
   }
}