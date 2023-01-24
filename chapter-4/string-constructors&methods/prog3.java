//program to creates a string objects with given char[].

class Test
{
   public static void main(String args[])
     {
        char ch[]={'w','e','l','c','o','m','e'};
        String s1=new String(ch);
        String s2=new String(ch,3,4);
        String s3=new String(ch,0,3);
        System.out.println(s1);//welcome
        System.out.println(s2);//come
        System.out.println(s3);//wel
     }
}