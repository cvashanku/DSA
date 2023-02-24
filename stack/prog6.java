//implementation of stack by using predefined class (java.util.Stack)
//Stack to hold Student objects

import java.util.*;
class Student
{
  int sid;
  String sname;
  Student(int sid,String sname)
  {
    this.sid=sid;
    this.sname=sname;
  }
  
  public String toString()
  {
    return "("+this.sid+","+this.sname+")";
  }
}
class Test
{
  public static void main(String args[])
  {
    Student s1=new Student(111,"AAA");
    Student s2=new Student(222,"BBB");
    Student s3=new Student(333,"CCC");
    Student s4=new Student(444,"DDD");
    Student s5=new Student(555,"EEE");
    Stack<Student> s=new Stack<>();
    s.push(s1);
    s.push(s2);
    s.push(s3);
    s.push(s4);
    s.push(s5);
    System.out.println(s);
    //[(111,AAA), (222,BBB), (333,CCC), (444,DDD), (555,EEE)]
    System.out.println(s.pop());//(555,EEE)
    System.out.println(s);
    //[(111,AAA), (222,BBB), (333,CCC), (444,DDD)]
  }
}