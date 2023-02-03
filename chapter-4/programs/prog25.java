/*
Chess Board 
----------------
You are given coordinates, a string that represents the coordinates of a square of the chess board. bellow is the chess board for your reference.

Return True if the saquare is in white, and false if the square is in Black.

The coordinates will always represent a valid chess board square. The coordinates will always have the letter first, and the number second.

white ---> true
black ---> false
*/

import java.util.*;
class Test
{
  public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     String s=obj.nextLine();
     int x=s.charAt(0)-96;
     int y=s.charAt(1);
     System.out.println(x%2!=y%2);
   }
}