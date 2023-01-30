//implement program to count number of consonants present in the given string

class Test
{
   public static void main(String args[])
     {
       String s="welcome";
       System.out.println(s);
       int c=0;
       for(int i=0;i<s.length();i++)
         {
           char ch=s.charAt(i);
           if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
               c++;
         }
         System.out.println("number of consonants="+c);
     }
}