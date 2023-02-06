class Test
{
  public static void main(String args[])
    {
	String s1=new String("spring");
	s1.concat("fall");
	String s2=s1.concat("winter");
	s2.concat("summer");
        System.out.println(s1);//spring
        System.out.println(s2);//springwinter
    }
}


/*
heap ------> 4
scp -------> 4
total -----> 8 */