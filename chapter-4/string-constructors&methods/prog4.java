//program to creates a String object with given byte[].

class Test
{
   public static void main(String args[])
     {
        byte b[]={65,66,67,68,97,98,99};
        String s1=new String(b);
        String s2=new String(b,0,4);
        String s3=new String(b,4,3);
        System.out.println(s1);//ABCDabc
        System.out.println(s2);//ABCD
        System.out.println(s3);//abc
     }
}