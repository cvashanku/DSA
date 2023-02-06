//program returns true if the two strings having same content by considering case
//program returns true if the two strings are having same content by ignoring case

class Test
{
   public static void main(String args[])
     {
        System.out.println("abc".equals("abc"));//true
	System.out.println("abc".equals("def"));//false
	System.out.println("abc".equals("ABC"));//false
	System.out.println("abc".equalsIgnoreCase("ABC"));//true
     }
}