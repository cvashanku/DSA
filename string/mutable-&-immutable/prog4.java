//program to demonstrate reference and content comparision

class Demo
{

}

class Test
{
  public static void main(String args[])
    {
       Demo d1=new Demo();
       Demo d2=new Demo();
       Demo d3=d1;
       System.out.println(d1==d2);//false
       System.out.println(d1.equals(d2));//false

       System.out.println(d1==d3);//true
       System.out.println(d1.equals(d3)); //true      
    }
}


//objects ---> == for ref comparision and .equals() for ref comprision