/*
void setCharAt(int,char) --> it replaces char present at given loc with new char
void deleteCharAt(int) ----> it removes char located at given loc
*/

class Test
{
  public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer("welkomae");
      System.out.println(sb);//welkomae
      System.out.println(sb.charAt(3));//k
      sb.setCharAt(3,'c');
      System.out.println(sb);//welcomae
      sb.deleteCharAt(6);
      System.out.println(sb);//welcome
    }
}