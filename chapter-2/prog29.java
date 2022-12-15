//Towers of Hanoi


import java.util.*;

class demo
{
  static int towersOfHanoi(int n,String src,String temp,String dest)
   {
     if(n==1)
       {
         System.out.println("move the disk "+n+" from "+src+" to "+dest);
           return;
       }
       towersOfHanoi(n-1,src,dest,temp);
       System.out.println("move the disk "+n+" from "+src+" to "+dest);
       towersOfHanoi(n-1,temp,src,dest);
   }
}

class test
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter number of disks:");
    int n=obj.nextInt();
    demo.towersOfHanoi(n,"s","t","d");
  }
}