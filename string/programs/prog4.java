//implement program to print vowels present in the given string.

class Test
{
   public static void main(String args[])
    {
       String s="welcome";
       System.out.println(s);
       for(int i=0;i<s.length();i++)
         {
           char ch=s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 System.out.println(ch);
         }
    }
}