//infinite recursion
class demo
{
  static void m()
  {
    System.out.println("good morning");
    m();
  }
}

class test
{
  public static void main(String args[])
   {
     demo.m();
   }
}