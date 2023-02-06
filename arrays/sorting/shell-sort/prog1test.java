//program to demonstrate singleton design pattern using lazy instantiation

class test
{
  private static test obj;
  
  private test(){};
  
  public static test getObj()
   {
     obj=new test();
     return obj;
   }
   public void doSomething()
    {
       System.out.println("singleton program");
    }
}