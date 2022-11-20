//finite recursion
class demo
{
  static int c=1;
  static void m()
  {
    if(c<=10)
     {
      System.out.println("good morning");
      c++;
      m();
     }
    else
     {

     }
  }
}

class test
{
  public static void main(String args[])
   {
     demo.m();
   }
}