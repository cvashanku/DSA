//program returns true if the given string starts with another str
//program returns true if the given string ends with another str

class Test
{
  public static void main(String args[])
    {
       String s=new String("java is very easy");
       System.out.println(s.startsWith("java"));//true
       System.out.println(s.startsWith("python"));//false
       System.out.println(s.endsWith("difficult"));//false
       System.out.println(s.endsWith("easy"));//true
    }
}